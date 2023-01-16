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

public val MaterialDesignIcons.CastAudioVariant: ImageVector
    get() {
        if (_castAudioVariant != null) {
            return _castAudioVariant!!
        }
        _castAudioVariant = Builder(name = "CastAudioVariant", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 12.0f)
                curveTo(14.5f, 10.62f, 13.38f, 9.5f, 12.0f, 9.5f)
                curveTo(10.62f, 9.5f, 9.5f, 10.62f, 9.5f, 12.0f)
                curveTo(9.5f, 13.0f, 10.09f, 13.84f, 10.93f, 14.25f)
                lineTo(9.82f, 15.35f)
                curveTo(8.73f, 14.64f, 8.0f, 13.41f, 8.0f, 12.0f)
                curveTo(8.0f, 9.79f, 9.79f, 8.0f, 12.0f, 8.0f)
                curveTo(14.21f, 8.0f, 16.0f, 9.79f, 16.0f, 12.0f)
                curveTo(16.0f, 13.41f, 15.27f, 14.64f, 14.18f, 15.35f)
                lineTo(13.08f, 14.25f)
                curveTo(13.92f, 13.84f, 14.5f, 13.0f, 14.5f, 12.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                curveTo(2.0f, 15.06f, 3.38f, 17.8f, 5.54f, 19.63f)
                lineTo(6.61f, 18.57f)
                curveTo(4.71f, 17.0f, 3.5f, 14.64f, 3.5f, 12.0f)
                curveTo(3.5f, 7.31f, 7.31f, 3.5f, 12.0f, 3.5f)
                curveTo(16.69f, 3.5f, 20.5f, 7.31f, 20.5f, 12.0f)
                curveTo(20.5f, 14.64f, 19.29f, 17.0f, 17.39f, 18.57f)
                lineTo(18.46f, 19.63f)
                curveTo(20.62f, 17.79f, 22.0f, 15.06f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(19.0f, 12.0f)
                curveTo(19.0f, 8.13f, 15.87f, 5.0f, 12.0f, 5.0f)
                curveTo(8.13f, 5.0f, 5.0f, 8.13f, 5.0f, 12.0f)
                curveTo(5.0f, 14.23f, 6.05f, 16.22f, 7.68f, 17.5f)
                lineTo(8.75f, 16.43f)
                curveTo(7.39f, 15.42f, 6.5f, 13.82f, 6.5f, 12.0f)
                curveTo(6.5f, 8.97f, 8.97f, 6.5f, 12.0f, 6.5f)
                curveTo(15.03f, 6.5f, 17.5f, 8.97f, 17.5f, 12.0f)
                curveTo(17.5f, 13.82f, 16.61f, 15.42f, 15.25f, 16.43f)
                lineTo(16.33f, 17.5f)
                curveTo(17.95f, 16.22f, 19.0f, 14.23f, 19.0f, 12.0f)
                moveTo(6.0f, 22.0f)
                horizontalLineTo(18.0f)
                lineTo(12.0f, 16.0f)
                lineTo(6.0f, 22.0f)
                close()
            }
        }
        .build()
        return _castAudioVariant!!
    }

private var _castAudioVariant: ImageVector? = null
