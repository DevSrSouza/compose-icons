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

public val OutlineGroup.Outbox: ImageVector
    get() {
        if (_outbox != null) {
            return _outbox!!
        }
        _outbox = Builder(name = "Outbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.83f)
                lineToRelative(0.0f, 4.17f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -4.17f)
                lineToRelative(1.59f, 1.58f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
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
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.02f)
                curveToRelative(0.91f, 1.21f, 2.35f, 2.0f, 3.98f, 2.0f)
                reflectiveCurveToRelative(3.06f, -0.79f, 3.98f, -2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(19.0f, 14.0f)
                horizontalLineToRelative(-4.18f)
                curveToRelative(-0.41f, 1.16f, -1.51f, 2.0f, -2.82f, 2.0f)
                reflectiveCurveToRelative(-2.4f, -0.84f, -2.82f, -2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _outbox!!
    }

private var _outbox: ImageVector? = null
