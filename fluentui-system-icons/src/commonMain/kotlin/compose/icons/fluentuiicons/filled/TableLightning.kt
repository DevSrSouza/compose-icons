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

public val FilledGroup.TableLightning: ImageVector
    get() {
        if (_tableLightning != null) {
            return _tableLightning!!
        }
        _tableLightning = Builder(name = "TableLightning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 21.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.4979f)
                curveTo(12.3987f, 20.0f, 11.6728f, 18.8568f, 12.1404f, 17.862f)
                lineTo(13.0155f, 16.0f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 21.0f)
                close()
                moveTo(21.0f, 9.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.3179f)
                curveTo(16.2096f, 11.0f, 16.1032f, 11.0117f, 16.0f, 11.034f)
                verticalLineTo(9.5f)
                horizontalLineTo(21.0f)
                close()
                moveTo(14.5f, 9.5f)
                lineTo(14.5f, 12.8415f)
                lineTo(13.7205f, 14.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(14.5f)
                close()
                moveTo(21.0f, 8.0f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(14.5f, 3.0f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 8.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(8.0f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                lineTo(8.0f, 3.0f)
                close()
                moveTo(3.0f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(3.0f)
                close()
                moveTo(3.0f, 16.0f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(8.0f)
                lineTo(8.0f, 16.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(16.3167f, 12.0f)
                horizontalLineTo(21.1443f)
                curveTo(21.5267f, 12.0f, 21.7676f, 12.4118f, 21.5801f, 12.7451f)
                lineTo(19.7492f, 16.0f)
                horizontalLineTo(21.2454f)
                curveTo(21.8899f, 16.0f, 22.2342f, 16.7593f, 21.8096f, 17.2441f)
                lineTo(16.9857f, 22.7519f)
                curveTo(16.4811f, 23.328f, 15.543f, 22.8375f, 15.7282f, 22.0945f)
                lineTo(16.4992f, 19.0f)
                horizontalLineTo(13.4967f)
                curveTo(13.1303f, 19.0f, 12.8883f, 18.6189f, 13.0442f, 18.2873f)
                lineTo(15.8642f, 12.2873f)
                curveTo(15.9466f, 12.112f, 16.1229f, 12.0f, 16.3167f, 12.0f)
                close()
            }
        }
        .build()
        return _tableLightning!!
    }

private var _tableLightning: ImageVector? = null
