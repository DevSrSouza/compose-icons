package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.SmartButton: ImageVector
    get() {
        if (_smartButton != null) {
            return _smartButton!!
        }
        _smartButton = Builder(name = "SmartButton", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveTo(21.1f, 7.0f, 22.0f, 7.9f, 22.0f, 9.0f)
                close()
                moveTo(14.5f, 19.0f)
                lineToRelative(1.09f, -2.41f)
                lineTo(18.0f, 15.5f)
                lineToRelative(-2.41f, -1.09f)
                lineTo(14.5f, 12.0f)
                lineToRelative(-1.09f, 2.41f)
                lineTo(11.0f, 15.5f)
                lineToRelative(2.41f, 1.09f)
                lineTo(14.5f, 19.0f)
                close()
                moveTo(17.0f, 14.0f)
                lineToRelative(0.62f, -1.38f)
                lineTo(19.0f, 12.0f)
                lineToRelative(-1.38f, -0.62f)
                lineTo(17.0f, 10.0f)
                lineToRelative(-0.62f, 1.38f)
                lineTo(15.0f, 12.0f)
                lineToRelative(1.38f, 0.62f)
                lineTo(17.0f, 14.0f)
                close()
                moveTo(14.5f, 19.0f)
                lineToRelative(1.09f, -2.41f)
                lineTo(18.0f, 15.5f)
                lineToRelative(-2.41f, -1.09f)
                lineTo(14.5f, 12.0f)
                lineToRelative(-1.09f, 2.41f)
                lineTo(11.0f, 15.5f)
                lineToRelative(2.41f, 1.09f)
                lineTo(14.5f, 19.0f)
                close()
                moveTo(17.0f, 14.0f)
                lineToRelative(0.62f, -1.38f)
                lineTo(19.0f, 12.0f)
                lineToRelative(-1.38f, -0.62f)
                lineTo(17.0f, 10.0f)
                lineToRelative(-0.62f, 1.38f)
                lineTo(15.0f, 12.0f)
                lineToRelative(1.38f, 0.62f)
                lineTo(17.0f, 14.0f)
                close()
            }
        }
        .build()
        return _smartButton!!
    }

private var _smartButton: ImageVector? = null
