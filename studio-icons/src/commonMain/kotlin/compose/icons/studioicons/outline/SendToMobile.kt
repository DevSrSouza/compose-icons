package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SendToMobile: ImageVector
    get() {
        if (_sendToMobile != null) {
            return _sendToMobile!!
        }
        _sendToMobile = Builder(name = "SendToMobile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(18.17f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.17f)
                lineToRelative(-1.59f, -1.59f)
                lineTo(18.0f, 8.0f)
                close()
                moveTo(7.0f, 1.01f)
                lineTo(17.0f, 1.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 1.9f, 5.9f, 1.01f, 7.0f, 1.01f)
                close()
                moveTo(7.0f, 21.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(7.0f, 4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _sendToMobile!!
    }

private var _sendToMobile: ImageVector? = null
