package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.MailLock: ImageVector
    get() {
        if (_mailLock != null) {
            return _mailLock!!
        }
        _mailLock = Builder(name = "MailLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.97f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.01f)
                lineTo(2.0f, 20.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-5.03f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(20.0f, 8.0f)
                lineToRelative(-8.0f, 5.0f)
                lineTo(4.0f, 8.0f)
                verticalLineTo(6.0f)
                lineToRelative(8.0f, 5.0f)
                lineToRelative(8.0f, -5.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 15.0f)
                verticalLineToRelative(-0.89f)
                curveToRelative(0.0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveTo(20.08f, 11.82f, 19.0f, 12.79f, 19.0f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(23.0f)
                close()
                moveTo(22.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _mailLock!!
    }

private var _mailLock: ImageVector? = null
