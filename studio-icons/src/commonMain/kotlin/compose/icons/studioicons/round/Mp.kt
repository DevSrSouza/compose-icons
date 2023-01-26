package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Mp: ImageVector
    get() {
        if (_mp != null) {
            return _mp!!
        }
        _mp = Builder(name = "Mp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(7.0f, 9.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(0.0f)
                curveTo(11.34f, 15.0f, 11.0f, 14.66f, 11.0f, 14.25f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.75f)
                curveTo(7.5f, 14.66f, 7.16f, 15.0f, 6.75f, 15.0f)
                horizontalLineToRelative(0.0f)
                curveTo(6.34f, 15.0f, 6.0f, 14.66f, 6.0f, 14.25f)
                verticalLineTo(10.0f)
                curveTo(6.0f, 9.45f, 6.45f, 9.0f, 7.0f, 9.0f)
                close()
                moveTo(14.25f, 15.0f)
                lineTo(14.25f, 15.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.33f, -0.75f, -0.75f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineTo(17.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.75f)
                curveTo(15.0f, 14.66f, 14.66f, 15.0f, 14.25f, 15.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _mp!!
    }

private var _mp: ImageVector? = null
