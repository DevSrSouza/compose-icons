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

public val MaterialDesignIcons.SignatureImage: ImageVector
    get() {
        if (_signatureImage != null) {
            return _signatureImage!!
        }
        _signatureImage = Builder(name = "SignatureImage", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(20.0f, 5.0f)
                horizontalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 7.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 18.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 16.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 5.0f)
                moveTo(10.0f, 16.0f)
                lineTo(12.6f, 12.7f)
                lineTo(14.4f, 14.9f)
                lineTo(16.8f, 11.6f)
                lineTo(20.0f, 16.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _signatureImage!!
    }

private var _signatureImage: ImageVector? = null
