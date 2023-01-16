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

public val MaterialDesignIcons.NfcSearchVariant: ImageVector
    get() {
        if (_nfcSearchVariant != null) {
            return _nfcSearchVariant!!
        }
        _nfcSearchVariant = Builder(name = "NfcSearchVariant", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 12.0f)
                curveTo(19.0f, 12.0f, 21.0f, 14.0f, 21.0f, 16.5f)
                curveTo(21.0f, 17.38f, 20.76f, 18.21f, 20.32f, 18.9f)
                lineTo(23.4f, 22.0f)
                lineTo(22.0f, 23.39f)
                lineTo(18.89f, 20.32f)
                curveTo(18.2f, 20.75f, 17.38f, 21.0f, 16.5f, 21.0f)
                curveTo(14.0f, 21.0f, 12.0f, 19.0f, 12.0f, 16.5f)
                curveTo(12.0f, 14.0f, 14.0f, 12.0f, 16.5f, 12.0f)
                moveTo(16.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 19.0f)
                curveTo(17.89f, 19.0f, 19.0f, 17.88f, 19.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 14.0f)
                moveTo(18.0f, 6.0f)
                verticalLineTo(10.18f)
                curveTo(17.33f, 10.0f, 16.66f, 9.97f, 16.0f, 10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.28f)
                lineTo(13.53f, 10.72f)
                curveTo(12.34f, 11.33f, 11.35f, 12.3f, 10.72f, 13.53f)
                curveTo(10.28f, 13.17f, 10.0f, 12.62f, 10.0f, 12.0f)
                curveTo(10.0f, 11.26f, 10.41f, 10.62f, 11.0f, 10.28f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 6.0f)
                horizontalLineTo(18.0f)
                moveTo(6.0f, 18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                lineTo(10.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                curveTo(9.96f, 16.68f, 10.0f, 17.35f, 10.17f, 18.0f)
                horizontalLineTo(6.0f)
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                curveTo(11.53f, 20.8f, 12.21f, 21.5f, 13.03f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 22.0f, 2.0f, 21.1f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 4.0f)
                verticalLineTo(13.04f)
                curveTo(21.5f, 12.24f, 20.82f, 11.54f, 20.0f, 11.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _nfcSearchVariant!!
    }

private var _nfcSearchVariant: ImageVector? = null
