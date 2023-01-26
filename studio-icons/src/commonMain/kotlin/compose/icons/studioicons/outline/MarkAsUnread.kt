package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.MarkAsUnread: ImageVector
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
                lineTo(10.5f, 2.0f)
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
                moveTo(20.0f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-7.0f)
                lineToRelative(6.5f, 3.33f)
                lineTo(20.0f, 12.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(13.5f, 13.33f)
                lineTo(7.0f, 10.0f)
                horizontalLineToRelative(13.0f)
                lineTo(13.5f, 13.33f)
                close()
            }
        }
        .build()
        return _markAsUnread!!
    }

private var _markAsUnread: ImageVector? = null
