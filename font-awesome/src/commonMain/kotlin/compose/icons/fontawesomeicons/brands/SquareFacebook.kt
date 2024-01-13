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

public val BrandsGroup.SquareFacebook: ImageVector
    get() {
        if (_squareFacebook != null) {
            return _squareFacebook!!
        }
        _squareFacebook = Builder(name = "SquareFacebook", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(98.2f)
                verticalLineTo(334.2f)
                horizontalLineTo(109.4f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(52.8f)
                verticalLineTo(222.3f)
                curveToRelative(0.0f, -87.1f, 39.4f, -127.5f, 125.0f, -127.5f)
                curveToRelative(16.2f, 0.0f, 44.2f, 3.2f, 55.7f, 6.4f)
                verticalLineTo(172.0f)
                curveToRelative(-6.0f, -0.6f, -16.5f, -1.0f, -29.6f, -1.0f)
                curveToRelative(-42.0f, 0.0f, -58.2f, 15.9f, -58.2f, 57.2f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(83.6f)
                lineToRelative(-14.4f, 78.2f)
                horizontalLineTo(255.0f)
                verticalLineTo(480.0f)
                horizontalLineTo(384.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(64.0f)
                close()
            }
        }
        .build()
        return _squareFacebook!!
    }

private var _squareFacebook: ImageVector? = null
