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

public val MaterialDesignIcons.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(name = "Dna", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                curveTo(6.0f, 5.44f, 6.68f, 6.61f, 7.88f, 7.78f)
                curveTo(8.74f, 8.61f, 9.89f, 9.41f, 11.09f, 10.2f)
                lineTo(9.26f, 11.39f)
                curveTo(8.27f, 10.72f, 7.31f, 10.0f, 6.5f, 9.21f)
                curveTo(5.07f, 7.82f, 4.0f, 6.1f, 4.0f, 4.0f)
                verticalLineTo(2.0f)
                moveTo(18.0f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 6.1f, 18.93f, 7.82f, 17.5f, 9.21f)
                curveTo(16.09f, 10.59f, 14.29f, 11.73f, 12.54f, 12.84f)
                curveTo(10.79f, 13.96f, 9.09f, 15.05f, 7.88f, 16.22f)
                curveTo(6.68f, 17.39f, 6.0f, 18.56f, 6.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 17.9f, 5.07f, 16.18f, 6.5f, 14.79f)
                curveTo(7.91f, 13.41f, 9.71f, 12.27f, 11.46f, 11.16f)
                curveTo(13.21f, 10.04f, 14.91f, 8.95f, 16.12f, 7.78f)
                curveTo(17.32f, 6.61f, 18.0f, 5.44f, 18.0f, 4.0f)
                verticalLineTo(2.0f)
                moveTo(14.74f, 12.61f)
                curveTo(15.73f, 13.28f, 16.69f, 14.0f, 17.5f, 14.79f)
                curveTo(18.93f, 16.18f, 20.0f, 17.9f, 20.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 18.56f, 17.32f, 17.39f, 16.12f, 16.22f)
                curveTo(15.26f, 15.39f, 14.11f, 14.59f, 12.91f, 13.8f)
                lineTo(14.74f, 12.61f)
                moveTo(7.0f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                lineTo(16.94f, 4.5f)
                horizontalLineTo(7.06f)
                lineTo(7.0f, 4.0f)
                verticalLineTo(3.0f)
                moveTo(7.68f, 6.0f)
                horizontalLineTo(16.32f)
                curveTo(16.08f, 6.34f, 15.8f, 6.69f, 15.42f, 7.06f)
                lineTo(14.91f, 7.5f)
                horizontalLineTo(9.07f)
                lineTo(8.58f, 7.06f)
                curveTo(8.2f, 6.69f, 7.92f, 6.34f, 7.68f, 6.0f)
                moveTo(9.09f, 16.5f)
                horizontalLineTo(14.93f)
                lineTo(15.42f, 16.94f)
                curveTo(15.8f, 17.31f, 16.08f, 17.66f, 16.32f, 18.0f)
                horizontalLineTo(7.68f)
                curveTo(7.92f, 17.66f, 8.2f, 17.31f, 8.58f, 16.94f)
                lineTo(9.09f, 16.5f)
                moveTo(7.06f, 19.5f)
                horizontalLineTo(16.94f)
                lineTo(17.0f, 20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                lineTo(7.06f, 19.5f)
                close()
            }
        }
        .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
