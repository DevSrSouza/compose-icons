package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ClipboardPaste: ImageVector
    get() {
        if (_clipboardPaste != null) {
            return _clipboardPaste!!
        }
        _clipboardPaste = Builder(name = "ClipboardPaste", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7533f, 2.0f)
                curveTo(13.9109f, 2.0f, 14.8641f, 2.8755f, 14.9867f, 4.0005f)
                lineTo(16.75f, 4.0f)
                curveTo(17.9409f, 4.0f, 18.9156f, 4.9252f, 18.9948f, 6.096f)
                lineTo(19.0f, 6.25f)
                curveTo(19.0f, 6.6292f, 18.7182f, 6.9426f, 18.3526f, 6.9922f)
                lineTo(18.249f, 6.999f)
                curveTo(17.8698f, 6.999f, 17.5564f, 6.7172f, 17.5068f, 6.3516f)
                lineTo(17.5f, 6.25f)
                curveTo(17.5f, 5.8703f, 17.2178f, 5.5565f, 16.8518f, 5.5068f)
                lineTo(16.75f, 5.5f)
                lineTo(14.6176f, 5.5008f)
                curveTo(14.2141f, 6.0995f, 13.5297f, 6.4933f, 12.7533f, 6.4933f)
                horizontalLineTo(9.2466f)
                curveTo(8.4703f, 6.4933f, 7.7859f, 6.0995f, 7.3824f, 5.5008f)
                lineTo(5.25f, 5.5f)
                curveTo(4.8703f, 5.5f, 4.5565f, 5.7821f, 4.5068f, 6.1482f)
                lineTo(4.5f, 6.25f)
                verticalLineTo(19.7546f)
                curveTo(4.5f, 20.1343f, 4.7821f, 20.4481f, 5.1482f, 20.4977f)
                lineTo(5.25f, 20.5046f)
                lineTo(8.25f, 20.5041f)
                curveTo(8.6296f, 20.5041f, 8.9434f, 20.7861f, 8.9931f, 21.1521f)
                lineTo(9.0f, 21.254f)
                curveTo(9.0f, 21.6682f, 8.6642f, 22.0041f, 8.25f, 22.0041f)
                lineTo(5.25f, 22.0046f)
                curveTo(4.0591f, 22.0046f, 3.0844f, 21.0794f, 3.0052f, 19.9086f)
                lineTo(3.0f, 19.7546f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 5.0591f, 3.9252f, 4.0844f, 5.096f, 4.0052f)
                lineTo(5.25f, 4.0f)
                lineTo(7.0133f, 4.0005f)
                curveTo(7.136f, 2.8755f, 8.0891f, 2.0f, 9.2466f, 2.0f)
                horizontalLineTo(12.7533f)
                close()
                moveTo(18.75f, 8.0f)
                curveTo(19.9409f, 8.0f, 20.9156f, 8.9252f, 20.9948f, 10.096f)
                lineTo(21.0f, 10.25f)
                verticalLineTo(19.75f)
                curveTo(21.0f, 20.9409f, 20.0748f, 21.9156f, 18.904f, 21.9948f)
                lineTo(18.75f, 22.0f)
                horizontalLineTo(12.25f)
                curveTo(11.0591f, 22.0f, 10.0844f, 21.0748f, 10.0052f, 19.904f)
                lineTo(10.0f, 19.75f)
                verticalLineTo(10.25f)
                curveTo(10.0f, 9.0591f, 10.9252f, 8.0844f, 12.096f, 8.0052f)
                lineTo(12.25f, 8.0f)
                horizontalLineTo(18.75f)
                close()
                moveTo(12.7533f, 3.5f)
                horizontalLineTo(9.2466f)
                curveTo(8.8343f, 3.5f, 8.5f, 3.8343f, 8.5f, 4.2467f)
                curveTo(8.5f, 4.659f, 8.8343f, 4.9933f, 9.2466f, 4.9933f)
                horizontalLineTo(12.7533f)
                curveTo(13.1657f, 4.9933f, 13.5f, 4.659f, 13.5f, 4.2467f)
                curveTo(13.5f, 3.8343f, 13.1657f, 3.5f, 12.7533f, 3.5f)
                close()
            }
        }
        .build()
        return _clipboardPaste!!
    }

private var _clipboardPaste: ImageVector? = null
