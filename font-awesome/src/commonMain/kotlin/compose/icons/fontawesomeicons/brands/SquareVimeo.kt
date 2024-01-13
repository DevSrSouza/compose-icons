package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.SquareVimeo: ImageVector
    get() {
        if (_squareVimeo != null) {
            return _squareVimeo!!
        }
        _squareVimeo = Builder(name = "SquareVimeo", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(64.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(384.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(318.5f, 309.5f)
                curveTo(275.0f, 366.0f, 238.2f, 394.3f, 208.1f, 394.3f)
                curveToRelative(-18.7f, 0.0f, -34.4f, -17.2f, -47.3f, -51.6f)
                curveToRelative(-3.8f, -13.9f, -7.3f, -26.9f, -10.5f, -39.0f)
                curveToRelative(-18.2f, -68.3f, -28.6f, -107.4f, -46.2f, -107.4f)
                curveToRelative(-2.4f, 0.0f, -10.8f, 5.0f, -25.1f, 15.1f)
                lineTo(64.0f, 192.0f)
                curveToRelative(7.0f, -6.1f, 13.9f, -12.4f, 20.6f, -18.5f)
                curveToRelative(29.1f, -26.3f, 55.6f, -50.3f, 73.5f, -51.9f)
                curveToRelative(24.9f, -2.4f, 40.2f, 14.6f, 46.0f, 51.1f)
                curveToRelative(20.5f, 129.6f, 29.6f, 149.2f, 66.8f, 90.5f)
                curveToRelative(13.4f, -21.2f, 20.6f, -37.2f, 21.5f, -48.3f)
                curveToRelative(3.4f, -32.8f, -25.6f, -30.6f, -45.2f, -22.2f)
                curveToRelative(15.7f, -51.5f, 45.8f, -76.5f, 90.1f, -75.1f)
                curveToRelative(32.9f, 1.0f, 48.4f, 22.4f, 46.5f, 64.0f)
                curveToRelative(-1.4f, 31.1f, -23.2f, 73.8f, -65.3f, 127.9f)
                close()
            }
        }
        .build()
        return _squareVimeo!!
    }

private var _squareVimeo: ImageVector? = null
