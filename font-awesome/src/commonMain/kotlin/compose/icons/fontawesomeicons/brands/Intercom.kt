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

public val BrandsGroup.Intercom: ImageVector
    get() {
        if (_intercom != null) {
            return _intercom!!
        }
        _intercom = Builder(name = "Intercom", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(392.0f, 32.0f)
                lineTo(56.0f, 32.0f)
                curveTo(25.1f, 32.0f, 0.0f, 57.1f, 0.0f, 88.0f)
                verticalLineToRelative(336.0f)
                curveToRelative(0.0f, 30.9f, 25.1f, 56.0f, 56.0f, 56.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, -25.1f, 56.0f, -56.0f)
                lineTo(448.0f, 88.0f)
                curveToRelative(0.0f, -30.9f, -25.1f, -56.0f, -56.0f, -56.0f)
                close()
                moveTo(283.7f, 114.1f)
                curveToRelative(0.0f, -19.8f, 29.9f, -19.8f, 29.9f, 0.0f)
                verticalLineToRelative(199.5f)
                curveToRelative(0.0f, 19.8f, -29.9f, 19.8f, -29.9f, 0.0f)
                lineTo(283.7f, 114.1f)
                close()
                moveTo(209.1f, 106.6f)
                curveToRelative(0.0f, -19.8f, 29.9f, -19.8f, 29.9f, 0.0f)
                verticalLineToRelative(216.5f)
                curveToRelative(0.0f, 19.8f, -29.9f, 19.8f, -29.9f, 0.0f)
                lineTo(209.1f, 106.6f)
                close()
                moveTo(134.4f, 114.1f)
                curveToRelative(0.0f, -19.8f, 29.9f, -19.8f, 29.9f, 0.0f)
                verticalLineToRelative(199.5f)
                curveToRelative(0.0f, 19.8f, -29.9f, 19.8f, -29.9f, 0.0f)
                lineTo(134.4f, 114.1f)
                close()
                moveTo(59.7f, 144.0f)
                curveToRelative(0.0f, -19.8f, 29.9f, -19.8f, 29.9f, 0.0f)
                verticalLineToRelative(134.3f)
                curveToRelative(0.0f, 19.8f, -29.9f, 19.8f, -29.9f, 0.0f)
                lineTo(59.7f, 144.0f)
                close()
                moveTo(383.1f, 371.8f)
                curveToRelative(-72.8f, 63.0f, -241.7f, 65.4f, -318.1f, 0.0f)
                curveToRelative(-15.0f, -12.8f, 4.4f, -35.5f, 19.4f, -22.7f)
                curveToRelative(65.9f, 55.3f, 216.1f, 53.9f, 279.3f, 0.0f)
                curveToRelative(14.9f, -12.9f, 34.3f, 9.8f, 19.4f, 22.7f)
                close()
                moveTo(388.3f, 278.3f)
                curveToRelative(0.0f, 19.8f, -29.9f, 19.8f, -29.9f, 0.0f)
                lineTo(358.4f, 144.0f)
                curveToRelative(0.0f, -19.8f, 29.9f, -19.8f, 29.9f, 0.0f)
                verticalLineToRelative(134.3f)
                close()
            }
        }
        .build()
        return _intercom!!
    }

private var _intercom: ImageVector? = null
