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

public val MaterialDesignIcons.GoogleStreetView: ImageVector
    get() {
        if (_googleStreetView != null) {
            return _googleStreetView!!
        }
        _googleStreetView = Builder(name = "GoogleStreetView", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.95f, 9.27f)
                curveTo(13.96f, 9.27f, 15.59f, 7.64f, 15.59f, 5.63f)
                curveTo(15.59f, 3.63f, 13.96f, 2.0f, 11.95f, 2.0f)
                curveTo(9.94f, 2.0f, 8.32f, 3.63f, 8.32f, 5.63f)
                curveTo(8.32f, 7.64f, 9.94f, 9.27f, 11.95f, 9.27f)
                moveTo(9.36f, 12.97f)
                curveTo(9.36f, 12.97f, 8.27f, 15.94f, 7.96f, 16.5f)
                curveTo(7.85f, 16.71f, 7.87f, 16.77f, 7.6f, 16.77f)
                curveTo(7.33f, 16.77f, 6.91f, 16.5f, 6.91f, 16.5f)
                curveTo(6.91f, 16.5f, 6.71f, 16.37f, 6.79f, 16.14f)
                curveTo(7.03f, 15.4f, 8.12f, 11.08f, 8.35f, 10.25f)
                curveTo(8.6f, 9.36f, 9.28f, 9.39f, 9.28f, 9.39f)
                horizontalLineTo(9.93f)
                lineTo(12.03f, 13.04f)
                lineTo(14.14f, 9.39f)
                horizontalLineTo(14.92f)
                curveTo(14.92f, 9.39f, 15.23f, 9.43f, 15.46f, 9.7f)
                curveTo(15.7f, 9.97f, 15.75f, 10.44f, 15.75f, 10.44f)
                lineTo(17.14f, 15.84f)
                curveTo(17.14f, 15.84f, 17.24f, 16.22f, 17.21f, 16.33f)
                curveTo(17.17f, 16.5f, 17.08f, 16.5f, 17.08f, 16.5f)
                curveTo(17.08f, 16.5f, 16.69f, 16.62f, 16.47f, 16.69f)
                curveTo(16.07f, 16.82f, 16.0f, 16.44f, 16.0f, 16.44f)
                lineTo(14.7f, 13.04f)
                lineTo(14.55f, 22.0f)
                horizontalLineTo(12.6f)
                lineTo(12.27f, 16.89f)
                curveTo(12.27f, 16.89f, 12.21f, 16.76f, 12.03f, 16.76f)
                curveTo(11.86f, 16.76f, 11.8f, 16.89f, 11.8f, 16.89f)
                lineTo(11.45f, 22.0f)
                horizontalLineTo(9.5f)
                lineTo(9.37f, 12.97f)
                horizontalLineTo(9.36f)
                close()
            }
        }
        .build()
        return _googleStreetView!!
    }

private var _googleStreetView: ImageVector? = null
