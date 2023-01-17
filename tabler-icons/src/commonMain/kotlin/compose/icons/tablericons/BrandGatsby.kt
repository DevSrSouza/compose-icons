package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandGatsby: ImageVector
    get() {
        if (_brandGatsby != null) {
            return _brandGatsby!!
        }
        _brandGatsby = Builder(name = "BrandGatsby", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.296f, 14.297f)
                lineToRelative(6.407f, 6.407f)
                arcToRelative(9.018f, 9.018f, 0.0f, false, true, -6.325f, -6.116f)
                lineToRelative(-0.082f, -0.291f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(-0.41f, 3.603f, -3.007f, 6.59f, -6.386f, 7.614f)
                lineToRelative(-11.228f, -11.229f)
                arcToRelative(9.004f, 9.004f, 0.0f, false, true, 15.66f, -2.985f)
            }
        }
        .build()
        return _brandGatsby!!
    }

private var _brandGatsby: ImageVector? = null
