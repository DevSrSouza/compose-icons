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

public val FilledGroup.CommentArrowLeft: ImageVector
    get() {
        if (_commentArrowLeft != null) {
            return _commentArrowLeft!!
        }
        _commentArrowLeft = Builder(name = "CommentArrowLeft", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 9.5376f, 12.0f, 6.5f)
                curveTo(12.0f, 3.4624f, 14.4624f, 1.0f, 17.5f, 1.0f)
                curveTo(20.5376f, 1.0f, 23.0f, 3.4624f, 23.0f, 6.5f)
                curveTo(23.0f, 9.5376f, 20.5376f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(20.5f, 7.0f)
                curveTo(20.7761f, 7.0f, 21.0f, 6.7761f, 21.0f, 6.5f)
                curveTo(21.0f, 6.2239f, 20.7761f, 6.0f, 20.5f, 6.0f)
                horizontalLineTo(15.7071f)
                lineTo(17.3536f, 4.3535f)
                curveTo(17.5488f, 4.1583f, 17.5488f, 3.8417f, 17.3536f, 3.6465f)
                curveTo(17.1583f, 3.4512f, 16.8417f, 3.4512f, 16.6464f, 3.6465f)
                lineTo(14.1464f, 6.1465f)
                curveTo(13.9512f, 6.3417f, 13.9512f, 6.6583f, 14.1464f, 6.8535f)
                lineTo(16.6464f, 9.3535f)
                curveTo(16.8417f, 9.5488f, 17.1583f, 9.5488f, 17.3536f, 9.3535f)
                curveTo(17.5488f, 9.1583f, 17.5488f, 8.8417f, 17.3536f, 8.6465f)
                lineTo(15.7071f, 7.0f)
                horizontalLineTo(20.5f)
                close()
                moveTo(17.5f, 13.0f)
                curveTo(19.2465f, 13.0f, 20.8321f, 12.3112f, 22.0f, 11.1904f)
                verticalLineTo(14.75f)
                curveTo(22.0f, 16.5449f, 20.5449f, 18.0f, 18.75f, 18.0f)
                horizontalLineTo(13.0f)
                lineTo(8.0f, 21.75f)
                curveTo(7.176f, 22.368f, 6.0f, 21.7801f, 6.0f, 20.75f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 18.0f, 2.0f, 16.5449f, 2.0f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 4.4551f, 3.4551f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(12.0218f)
                curveTo(11.375f, 4.0103f, 11.0f, 5.2114f, 11.0f, 6.5f)
                curveTo(11.0f, 10.0899f, 13.9101f, 13.0f, 17.5f, 13.0f)
                close()
            }
        }
        .build()
        return _commentArrowLeft!!
    }

private var _commentArrowLeft: ImageVector? = null
