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

public val MaterialDesignIcons.KettleSteamOutline: ImageVector
    get() {
        if (_kettleSteamOutline != null) {
            return _kettleSteamOutline!!
        }
        _kettleSteamOutline = Builder(name = "KettleSteamOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 3.0f)
                curveTo(4.8f, 3.0f, 1.0f, 5.7f, 1.0f, 9.0f)
                curveTo(1.0f, 10.2f, 1.5f, 11.3f, 2.4f, 12.3f)
                curveTo(1.5f, 13.5f, 0.985f, 15.0f, 1.0f, 16.5f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.1f, 1.9f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(17.11f, 22.0f, 18.0f, 21.11f, 18.0f, 20.0f)
                verticalLineTo(16.5f)
                curveTo(18.0f, 15.3f, 17.7f, 14.1f, 17.0f, 13.0f)
                lineTo(19.0f, 11.0f)
                lineTo(16.0f, 8.0f)
                lineTo(13.9f, 10.1f)
                curveTo(10.97f, 8.5f, 7.42f, 8.63f, 4.6f, 10.4f)
                curveTo(4.22f, 10.03f, 4.0f, 9.53f, 4.0f, 9.0f)
                curveTo(4.0f, 7.2f, 6.5f, 5.7f, 9.5f, 5.7f)
                curveTo(10.9f, 5.7f, 12.3f, 6.1f, 13.3f, 6.7f)
                lineTo(15.3f, 4.7f)
                curveTo(13.59f, 3.55f, 11.56f, 2.96f, 9.5f, 3.0f)
                moveTo(9.5f, 11.0f)
                curveTo(13.0f, 11.0f, 16.0f, 14.0f, 16.0f, 16.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 14.0f, 6.0f, 11.0f, 9.5f, 11.0f)
                moveTo(10.0f, 12.5f)
                curveTo(7.0f, 12.5f, 5.0f, 14.0f, 5.0f, 17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                curveTo(7.0f, 16.0f, 7.0f, 13.5f, 10.0f, 12.5f)
                moveTo(23.0f, 7.3f)
                curveTo(23.0f, 8.93f, 21.91f, 10.6f, 20.38f, 10.97f)
                lineTo(19.71f, 10.29f)
                lineTo(19.0f, 9.6f)
                horizontalLineTo(19.75f)
                curveTo(20.75f, 9.6f, 21.5f, 8.22f, 21.5f, 7.2f)
                curveTo(21.5f, 6.18f, 20.65f, 5.14f, 19.65f, 5.14f)
                verticalLineTo(3.64f)
                curveTo(21.5f, 3.64f, 23.0f, 5.45f, 23.0f, 7.3f)
                moveTo(17.65f, 6.73f)
                curveTo(17.03f, 6.12f, 16.65f, 5.28f, 16.65f, 4.35f)
                curveTo(16.65f, 2.5f, 18.15f, 1.0f, 20.0f, 1.0f)
                verticalLineTo(2.5f)
                curveTo(19.0f, 2.5f, 18.15f, 3.33f, 18.15f, 4.35f)
                curveTo(18.15f, 5.37f, 19.0f, 6.2f, 20.0f, 6.2f)
                verticalLineTo(7.7f)
                curveTo(19.18f, 7.7f, 18.42f, 7.95f, 17.79f, 8.38f)
                lineTo(16.72f, 7.31f)
                curveTo(17.0f, 7.09f, 17.32f, 6.89f, 17.65f, 6.73f)
                close()
            }
        }
        .build()
        return _kettleSteamOutline!!
    }

private var _kettleSteamOutline: ImageVector? = null
