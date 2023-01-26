package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.MarkAsUnread: ImageVector
    get() {
        if (_markAsUnread != null) {
            return _markAsUnread!!
        }
        _markAsUnread = Builder(name = "MarkAsUnread", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.23f, 7.0f)
                horizontalLineToRelative(2.6f)
                curveToRelative(-0.06f, -0.47f, -0.36f, -0.94f, -0.79f, -1.17f)
                lineTo(11.4f, 2.45f)
                curveToRelative(-0.56f, -0.29f, -1.23f, -0.29f, -1.8f, -0.01f)
                lineTo(2.8f, 5.83f)
                curveTo(2.32f, 6.09f, 2.0f, 6.64f, 2.0f, 7.17f)
                verticalLineTo(15.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                verticalLineTo(7.4f)
                lineTo(10.5f, 4.0f)
                lineTo(16.23f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-9.0f)
                curveTo(22.0f, 8.9f, 21.1f, 8.0f, 20.0f, 8.0f)
                close()
                moveTo(20.0f, 11.46f)
                curveToRelative(0.0f, 0.33f, -0.19f, 0.64f, -0.48f, 0.79f)
                lineToRelative(-5.61f, 2.88f)
                curveToRelative(-0.25f, 0.13f, -0.56f, 0.13f, -0.81f, 0.0f)
                lineToRelative(-5.61f, -2.88f)
                curveTo(7.19f, 12.1f, 7.0f, 11.79f, 7.0f, 11.46f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.67f, 0.7f, -1.1f, 1.3f, -0.79f)
                lineToRelative(5.2f, 2.67f)
                lineToRelative(5.2f, -2.67f)
                curveTo(19.3f, 10.36f, 20.0f, 10.79f, 20.0f, 11.46f)
                lineTo(20.0f, 11.46f)
                close()
            }
        }
        .build()
        return _markAsUnread!!
    }

private var _markAsUnread: ImageVector? = null
