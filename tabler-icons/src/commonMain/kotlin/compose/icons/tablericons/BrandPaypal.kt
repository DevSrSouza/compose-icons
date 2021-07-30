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

public val TablerIcons.BrandPaypal: ImageVector
    get() {
        if (_brandPaypal != null) {
            return _brandPaypal!!
        }
        _brandPaypal = Builder(name = "BrandPaypal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 13.0f)
                lineToRelative(2.5f, 0.0f)
                curveToRelative(2.5f, 0.0f, 5.0f, -2.5f, 5.0f, -5.0f)
                curveToRelative(0.0f, -3.0f, -1.9f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-0.5f, 0.0f, -1.0f, 0.5f, -1.0f, 1.0f)
                lineToRelative(-2.0f, 14.0f)
                curveToRelative(0.0f, 0.5f, 0.5f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.8f)
                lineToRelative(1.2f, -5.0f)
                curveToRelative(0.1f, -0.6f, 0.4f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(17.5f, 7.2f)
                curveToRelative(1.7f, 1.0f, 2.5f, 2.8f, 2.5f, 4.8f)
                curveToRelative(0.0f, 2.5f, -2.5f, 4.5f, -5.0f, 4.5f)
                horizontalLineToRelative(-2.6f)
                lineToRelative(-0.6f, 3.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 0.8f)
                lineToRelative(-2.7f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.6f)
                lineToRelative(0.2f, -1.4f)
            }
        }
        .build()
        return _brandPaypal!!
    }

private var _brandPaypal: ImageVector? = null
