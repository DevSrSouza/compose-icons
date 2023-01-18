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

public val FilledGroup.HomeDatabase: ImageVector
    get() {
        if (_homeDatabase != null) {
            return _homeDatabase!!
        }
        _homeDatabase = Builder(name = "HomeDatabase", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4508f, 2.5332f)
                curveTo(12.6128f, 1.8262f, 11.3872f, 1.8262f, 10.5492f, 2.5332f)
                lineTo(3.7992f, 8.2277f)
                curveTo(3.2924f, 8.6552f, 3.0f, 9.2845f, 3.0f, 9.9475f)
                verticalLineTo(19.7504f)
                curveTo(3.0f, 20.7169f, 3.7835f, 21.5004f, 4.75f, 21.5004f)
                horizontalLineTo(7.75f)
                curveTo(7.7631f, 21.5004f, 7.7761f, 21.5003f, 7.7891f, 21.5f)
                horizontalLineTo(12.2249f)
                curveTo(12.0828f, 21.1986f, 12.0f, 20.8653f, 12.0f, 20.5f)
                verticalLineTo(14.5f)
                curveTo(12.0f, 13.2268f, 13.0061f, 12.3434f, 14.0173f, 11.8378f)
                curveTo(15.0882f, 11.3023f, 16.4977f, 11.0f, 18.0f, 11.0f)
                curveTo(19.0781f, 11.0f, 20.1083f, 11.1557f, 21.0f, 11.4415f)
                verticalLineTo(9.9475f)
                curveTo(21.0f, 9.2845f, 20.7076f, 8.6552f, 20.2008f, 8.2277f)
                lineTo(13.4508f, 2.5332f)
                close()
                moveTo(21.0f, 17.5585f)
                curveTo(21.3509f, 17.446f, 21.6803f, 17.3134f, 21.9827f, 17.1622f)
                curveTo(22.3368f, 16.9852f, 22.6902f, 16.7619f, 23.0f, 16.4917f)
                verticalLineTo(20.5f)
                curveTo(23.0f, 21.8807f, 20.7614f, 23.0f, 18.0f, 23.0f)
                curveTo(15.9497f, 23.0f, 14.1876f, 22.383f, 13.416f, 21.5f)
                curveTo(13.1484f, 21.1938f, 13.0f, 20.8556f, 13.0f, 20.5f)
                verticalLineTo(16.4917f)
                curveTo(13.3098f, 16.7619f, 13.6632f, 16.9852f, 14.0173f, 17.1622f)
                curveTo(14.1511f, 17.2291f, 14.2903f, 17.2924f, 14.4342f, 17.3519f)
                curveTo(15.442f, 17.7685f, 16.6855f, 18.0f, 18.0f, 18.0f)
                curveTo(19.0781f, 18.0f, 20.1083f, 17.8443f, 21.0f, 17.5585f)
                close()
                moveTo(13.0f, 14.5f)
                curveTo(13.0f, 14.1444f, 13.1484f, 13.8062f, 13.416f, 13.5f)
                curveTo(14.1876f, 12.617f, 15.9497f, 12.0f, 18.0f, 12.0f)
                curveTo(19.1256f, 12.0f, 20.1643f, 12.186f, 21.0f, 12.4998f)
                curveTo(22.2144f, 12.9559f, 23.0f, 13.6821f, 23.0f, 14.5f)
                curveTo(23.0f, 15.3179f, 22.2144f, 16.0441f, 21.0f, 16.5002f)
                curveTo(20.1643f, 16.814f, 19.1256f, 17.0f, 18.0f, 17.0f)
                curveTo(15.2386f, 17.0f, 13.0f, 15.8807f, 13.0f, 14.5f)
                close()
            }
        }
        .build()
        return _homeDatabase!!
    }

private var _homeDatabase: ImageVector? = null
