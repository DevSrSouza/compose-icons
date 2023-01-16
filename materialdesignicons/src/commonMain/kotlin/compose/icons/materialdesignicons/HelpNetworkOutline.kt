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

public val MaterialDesignIcons.HelpNetworkOutline: ImageVector
    get() {
        if (_helpNetworkOutline != null) {
            return _helpNetworkOutline!!
        }
        _helpNetworkOutline = Builder(name = "HelpNetworkOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 15.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 3.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 5.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 23.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                moveTo(7.0f, 15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                moveTo(11.95f, 6.0f)
                curveTo(11.17f, 6.0f, 10.55f, 6.18f, 10.07f, 6.5f)
                curveTo(9.61f, 6.89f, 9.38f, 7.4f, 9.39f, 8.1f)
                lineTo(9.4f, 8.13f)
                horizontalLineTo(11.11f)
                curveTo(11.12f, 7.86f, 11.2f, 7.65f, 11.36f, 7.5f)
                curveTo(11.5f, 7.38f, 11.72f, 7.31f, 11.95f, 7.31f)
                curveTo(12.22f, 7.31f, 12.45f, 7.4f, 12.61f, 7.56f)
                curveTo(12.77f, 7.73f, 12.85f, 7.96f, 12.85f, 8.22f)
                curveTo(12.85f, 8.5f, 12.78f, 8.75f, 12.64f, 8.95f)
                curveTo(12.5f, 9.16f, 12.33f, 9.33f, 12.1f, 9.5f)
                curveTo(11.65f, 9.78f, 11.34f, 10.05f, 11.17f, 10.29f)
                curveTo(11.0f, 10.5f, 10.89f, 10.89f, 10.89f, 11.33f)
                horizontalLineTo(12.67f)
                curveTo(12.67f, 11.06f, 12.7f, 10.84f, 12.78f, 10.68f)
                curveTo(12.86f, 10.5f, 13.0f, 10.36f, 13.24f, 10.21f)
                curveTo(13.64f, 10.0f, 13.97f, 9.74f, 14.22f, 9.39f)
                curveTo(14.5f, 9.03f, 14.62f, 8.67f, 14.62f, 8.22f)
                curveTo(14.62f, 7.55f, 14.38f, 7.0f, 13.9f, 6.61f)
                curveTo(13.42f, 6.2f, 12.77f, 6.0f, 11.95f, 6.0f)
                moveTo(10.89f, 12.22f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.67f)
                verticalLineTo(12.22f)
                horizontalLineTo(10.89f)
                close()
            }
        }
        .build()
        return _helpNetworkOutline!!
    }

private var _helpNetworkOutline: ImageVector? = null
