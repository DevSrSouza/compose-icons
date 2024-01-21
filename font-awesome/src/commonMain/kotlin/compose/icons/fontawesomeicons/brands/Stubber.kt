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

public val BrandsGroup.Stubber: ImageVector
    get() {
        if (_stubber != null) {
            return _stubber!!
        }
        _stubber = Builder(name = "Stubber", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.5f, 294.2f)
                lineToRelative(58.8f, 22.9f)
                curveToRelative(9.1f, -36.8f, 25.4f, -61.1f, 55.0f, -61.1f)
                curveToRelative(49.4f, 0.0f, 71.4f, 63.6f, 142.4f, 63.6f)
                curveToRelative(15.6f, 0.0f, 35.9f, -2.8f, 55.3f, -13.3f)
                verticalLineTo(368.0f)
                curveToRelative(0.0f, 61.8f, -50.4f, 112.0f, -112.3f, 112.0f)
                horizontalLineTo(0.0f)
                lineToRelative(41.8f, -56.0f)
                lineTo(0.0f, 368.0f)
                lineToRelative(41.7f, -56.0f)
                lineTo(0.0f, 256.1f)
                lineToRelative(41.8f, -56.0f)
                lineTo(0.0f, 144.1f)
                lineTo(41.8f, 88.0f)
                lineTo(0.0f, 32.0f)
                horizontalLineTo(335.7f)
                curveTo(397.6f, 32.0f, 448.0f, 82.3f, 448.0f, 144.1f)
                verticalLineToRelative(51.3f)
                curveToRelative(-9.2f, 36.3f, -25.9f, 60.6f, -55.0f, 60.6f)
                curveToRelative(-49.6f, 0.0f, -71.6f, -63.5f, -142.4f, -63.5f)
                curveToRelative(-35.9f, 0.0f, -95.2f, 14.6f, -114.1f, 101.6f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _stubber!!
    }

private var _stubber: ImageVector? = null
