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

public val MaterialDesignIcons.SailBoatSink: ImageVector
    get() {
        if (_sailBoatSink != null) {
            return _sailBoatSink!!
        }
        _sailBoatSink = Builder(name = "SailBoatSink", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.96f, 21.0f)
                curveTo(19.9f, 21.0f, 18.9f, 20.74f, 17.96f, 20.24f)
                curveTo(16.12f, 21.24f, 13.81f, 21.24f, 11.97f, 20.24f)
                curveTo(10.13f, 21.24f, 7.82f, 21.24f, 6.0f, 20.24f)
                curveTo(4.77f, 20.93f, 3.36f, 21.04f, 2.0f, 21.0f)
                verticalLineTo(19.0f)
                curveTo(3.41f, 19.04f, 4.77f, 18.89f, 6.0f, 18.0f)
                curveTo(7.74f, 19.24f, 10.21f, 19.24f, 11.97f, 18.0f)
                curveTo(13.74f, 19.24f, 16.2f, 19.24f, 17.96f, 18.0f)
                curveTo(19.17f, 18.89f, 20.54f, 19.04f, 21.94f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.96f)
                moveTo(22.0f, 3.5f)
                lineTo(7.11f, 5.96f)
                lineTo(13.11f, 12.17f)
                lineTo(22.0f, 3.5f)
                moveTo(10.81f, 16.36f)
                lineTo(11.97f, 15.54f)
                lineTo(13.12f, 16.36f)
                curveTo(13.65f, 16.72f, 14.3f, 16.93f, 14.97f, 16.93f)
                curveTo(15.12f, 16.93f, 15.28f, 16.91f, 15.43f, 16.89f)
                lineTo(5.2f, 6.31f)
                curveTo(4.29f, 7.65f, 3.9f, 9.32f, 4.0f, 10.92f)
                lineTo(9.74f, 16.83f)
                curveTo(10.13f, 16.74f, 10.5f, 16.58f, 10.81f, 16.36f)
                close()
            }
        }
        .build()
        return _sailBoatSink!!
    }

private var _sailBoatSink: ImageVector? = null
