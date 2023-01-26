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

public val OutlineGroup.Rsvp: ImageVector
    get() {
        if (_rsvp != null) {
            return _rsvp!!
        }
        _rsvp = Builder(name = "Rsvp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                horizontalLineToRelative(1.5f)
                lineToRelative(-1.75f, 6.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(12.5f, 9.0f)
                horizontalLineTo(14.0f)
                lineToRelative(1.0f, 3.43f)
                lineTo(16.0f, 9.0f)
                close()
                moveTo(5.1f, 12.9f)
                lineTo(6.0f, 15.0f)
                horizontalLineTo(4.5f)
                lineToRelative(-0.85f, -2.0f)
                horizontalLineTo(2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(3.5f)
                curveTo(5.35f, 9.0f, 6.0f, 9.65f, 6.0f, 10.5f)
                verticalLineToRelative(1.0f)
                curveTo(6.0f, 12.1f, 5.6f, 12.65f, 5.1f, 12.9f)
                close()
                moveTo(4.5f, 10.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.5f)
                close()
                moveTo(21.5f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                curveTo(23.0f, 12.33f, 22.33f, 13.0f, 21.5f, 13.0f)
                close()
                moveTo(21.5f, 10.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.5f)
                close()
                moveTo(11.5f, 9.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(14.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.75f)
                horizontalLineTo(7.75f)
                curveTo(7.34f, 12.75f, 7.0f, 12.41f, 7.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _rsvp!!
    }

private var _rsvp: ImageVector? = null
