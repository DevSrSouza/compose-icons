package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.SignatureText: ImageVector
    get() {
        if (_signatureText != null) {
            return _signatureText!!
        }
        _signatureText = Builder(name = "SignatureText", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                moveTo(6.2f, 17.3f)
                lineTo(4.8f, 15.9f)
                lineTo(6.2f, 14.5f)
                lineTo(5.5f, 13.8f)
                lineTo(4.1f, 15.2f)
                lineTo(2.7f, 13.8f)
                lineTo(2.0f, 14.5f)
                lineTo(3.4f, 15.9f)
                lineTo(2.0f, 17.3f)
                lineTo(2.7f, 18.0f)
                lineTo(4.1f, 16.6f)
                lineTo(5.5f, 18.0f)
                lineTo(6.2f, 17.3f)
                moveTo(20.5f, 3.0f)
                lineTo(21.7f, 7.4f)
                lineTo(20.7f, 7.7f)
                curveTo(20.2f, 6.8f, 19.8f, 6.0f, 19.3f, 5.5f)
                curveTo(18.7f, 5.0f, 18.1f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.5f)
                curveTo(15.0f, 16.0f, 15.0f, 16.5f, 15.3f, 16.7f)
                curveTo(15.6f, 16.9f, 16.3f, 16.9f, 17.0f, 16.9f)
                verticalLineTo(17.9f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.9f)
                curveTo(11.7f, 16.9f, 12.3f, 16.9f, 12.7f, 16.7f)
                curveTo(13.0f, 16.5f, 13.0f, 16.0f, 13.0f, 15.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.5f)
                curveTo(9.9f, 5.0f, 9.3f, 5.0f, 8.7f, 5.4f)
                curveTo(8.2f, 5.8f, 7.7f, 6.7f, 7.3f, 7.6f)
                lineTo(6.3f, 7.3f)
                lineTo(7.5f, 3.0f)
                horizontalLineTo(20.5f)
                close()
            }
        }
        .build()
        return _signatureText!!
    }

private var _signatureText: ImageVector? = null
