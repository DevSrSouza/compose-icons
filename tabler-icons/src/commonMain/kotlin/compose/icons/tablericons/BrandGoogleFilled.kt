package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandGoogleFilled: ImageVector
    get() {
        if (_brandGoogleFilled != null) {
            return _brandGoogleFilled!!
        }
        _brandGoogleFilled = Builder(name = "BrandGoogleFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(9.96f, 9.96f, 0.0f, false, true, 6.29f, 2.226f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.04f, 1.52f)
                lineToRelative(-1.51f, 1.362f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.265f, 0.06f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 2.103f, 6.836f)
                lineToRelative(0.001f, -0.004f)
                horizontalLineToRelative(-3.66f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.992f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(6.945f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.994f, 0.89f)
                curveToRelative(0.04f, 0.367f, 0.061f, 0.737f, 0.061f, 1.11f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveToRelative(-10.0f, -4.477f, -10.0f, -10.0f)
                reflectiveCurveToRelative(4.477f, -10.0f, 10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _brandGoogleFilled!!
    }

private var _brandGoogleFilled: ImageVector? = null
