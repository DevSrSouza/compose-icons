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

public val MaterialDesignIcons.MicrosoftOffice: ImageVector
    get() {
        if (_microsoftOffice != null) {
            return _microsoftOffice!!
        }
        _microsoftOffice = Builder(name = "MicrosoftOffice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.94f, 5.59f)
                verticalLineTo(18.39f)
                quadTo(19.94f, 19.06f, 19.55f, 19.59f)
                quadTo(19.16f, 20.11f, 18.5f, 20.29f)
                lineTo(12.77f, 21.94f)
                quadTo(12.65f, 21.97f, 12.5f, 22.0f)
                horizontalLineTo(12.28f)
                quadTo(11.95f, 22.0f, 11.68f, 21.91f)
                quadTo(11.41f, 21.82f, 11.13f, 21.67f)
                lineTo(7.38f, 19.55f)
                quadTo(7.17f, 19.43f, 7.05f, 19.24f)
                quadTo(6.93f, 19.05f, 6.93f, 18.81f)
                quadTo(6.93f, 18.45f, 7.19f, 18.2f)
                quadTo(7.44f, 17.95f, 7.8f, 17.95f)
                horizontalLineTo(12.66f)
                verticalLineTo(6.14f)
                lineTo(9.0f, 7.44f)
                quadTo(8.57f, 7.6f, 8.3f, 8.0f)
                quadTo(8.03f, 8.38f, 8.03f, 8.85f)
                verticalLineTo(15.58f)
                quadTo(8.03f, 16.0f, 7.82f, 16.34f)
                quadTo(7.62f, 16.68f, 7.25f, 16.88f)
                lineTo(5.53f, 17.82f)
                quadTo(5.29f, 17.95f, 5.05f, 17.95f)
                quadTo(4.64f, 17.95f, 4.35f, 17.66f)
                quadTo(4.06f, 17.37f, 4.06f, 16.95f)
                verticalLineTo(7.47f)
                quadTo(4.06f, 6.95f, 4.33f, 6.5f)
                quadTo(4.61f, 6.0f, 5.06f, 5.74f)
                lineTo(11.22f, 2.24f)
                quadTo(11.43f, 2.12f, 11.67f, 2.06f)
                quadTo(11.91f, 2.0f, 12.15f, 2.0f)
                quadTo(12.32f, 2.0f, 12.46f, 2.03f)
                quadTo(12.6f, 2.05f, 12.77f, 2.1f)
                lineTo(18.5f, 3.69f)
                quadTo(18.83f, 3.78f, 19.09f, 3.96f)
                quadTo(19.35f, 4.14f, 19.54f, 4.39f)
                quadTo(19.74f, 4.65f, 19.84f, 4.95f)
                quadTo(19.94f, 5.26f, 19.94f, 5.59f)
                moveTo(18.62f, 18.39f)
                verticalLineTo(5.59f)
                quadTo(18.62f, 5.36f, 18.5f, 5.19f)
                quadTo(18.35f, 5.0f, 18.13f, 4.96f)
                lineTo(15.31f, 4.18f)
                quadTo(15.0f, 4.09f, 14.65f, 4.0f)
                quadTo(14.32f, 3.89f, 14.0f, 3.81f)
                verticalLineTo(20.21f)
                lineTo(18.13f, 19.0f)
                quadTo(18.35f, 18.96f, 18.5f, 18.79f)
                quadTo(18.62f, 18.62f, 18.62f, 18.39f)
                close()
            }
        }
        .build()
        return _microsoftOffice!!
    }

private var _microsoftOffice: ImageVector? = null
