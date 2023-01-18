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

public val RegularGroup.TabArrowLeft: ImageVector
    get() {
        if (_tabArrowLeft != null) {
            return _tabArrowLeft!!
        }
        _tabArrowLeft = Builder(name = "TabArrowLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 4.2312f, 4.2312f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(18.25f)
                curveTo(19.7688f, 3.0f, 21.0f, 4.2312f, 21.0f, 5.75f)
                verticalLineTo(12.0218f)
                curveTo(20.5368f, 11.7253f, 20.0335f, 11.4858f, 19.5f, 11.3135f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.0596f, 18.9404f, 4.5f, 18.25f, 4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.0596f, 4.5f, 4.5f, 5.0596f, 4.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(4.5f, 18.9404f, 5.0596f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(11.3135f)
                curveTo(11.4858f, 20.0335f, 11.7253f, 20.5368f, 12.0218f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 21.0f, 3.0f, 19.7688f, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                close()
                moveTo(20.5f, 18.0f)
                curveTo(20.7761f, 18.0f, 21.0f, 17.7761f, 21.0f, 17.5f)
                curveTo(21.0f, 17.2239f, 20.7761f, 17.0f, 20.5f, 17.0f)
                horizontalLineTo(15.7071f)
                lineTo(17.3536f, 15.3536f)
                curveTo(17.5488f, 15.1583f, 17.5488f, 14.8417f, 17.3536f, 14.6464f)
                curveTo(17.1583f, 14.4512f, 16.8417f, 14.4512f, 16.6464f, 14.6464f)
                lineTo(14.1464f, 17.1464f)
                curveTo(13.9512f, 17.3417f, 13.9512f, 17.6583f, 14.1464f, 17.8536f)
                lineTo(16.6464f, 20.3536f)
                curveTo(16.8417f, 20.5488f, 17.1583f, 20.5488f, 17.3536f, 20.3536f)
                curveTo(17.5488f, 20.1583f, 17.5488f, 19.8417f, 17.3536f, 19.6464f)
                lineTo(15.7071f, 18.0f)
                horizontalLineTo(20.5f)
                close()
            }
        }
        .build()
        return _tabArrowLeft!!
    }

private var _tabArrowLeft: ImageVector? = null
