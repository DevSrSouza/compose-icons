package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.CalendarAssistant: ImageVector
    get() {
        if (_calendarAssistant != null) {
            return _calendarAssistant!!
        }
        _calendarAssistant = Builder(name = "CalendarAssistant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(12.0218f)
                curveTo(20.5368f, 11.7253f, 20.0335f, 11.4858f, 19.5f, 11.3135f)
                verticalLineTo(8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(11.3135f)
                curveTo(11.4858f, 20.0335f, 11.7253f, 20.5368f, 12.0218f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                close()
                moveTo(17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                close()
                moveTo(17.0965f, 14.0f)
                horizontalLineTo(18.5285f)
                curveTo(18.8776f, 14.0f, 19.1192f, 14.3487f, 18.9967f, 14.6756f)
                lineTo(18.5f, 16.0f)
                horizontalLineTo(19.1345f)
                curveTo(19.5072f, 16.0f, 19.7314f, 16.4132f, 19.5283f, 16.7257f)
                lineTo(16.9032f, 20.7643f)
                curveTo(16.8077f, 20.9113f, 16.6442f, 21.0f, 16.4688f, 21.0f)
                curveTo(16.1152f, 21.0f, 15.8655f, 20.6535f, 15.9773f, 20.3181f)
                lineTo(16.75f, 18.0f)
                horizontalLineTo(15.9715f)
                curveTo(15.6224f, 18.0f, 15.3808f, 17.6513f, 15.5033f, 17.3244f)
                lineTo(16.6283f, 14.3244f)
                curveTo(16.7015f, 14.1293f, 16.8881f, 14.0f, 17.0965f, 14.0f)
                close()
            }
        }
        .build()
        return _calendarAssistant!!
    }

private var _calendarAssistant: ImageVector? = null
