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

public val SharpGroup.ScreenSearchDesktop: ImageVector
    get() {
        if (_screenSearchDesktop != null) {
            return _screenSearchDesktop!!
        }
        _screenSearchDesktop = Builder(name = "ScreenSearchDesktop", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 19.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(19.99f)
                lineTo(22.0f, 3.0f)
                close()
                moveTo(15.47f, 15.03f)
                lineToRelative(-2.09f, -2.09f)
                curveToRelative(-1.35f, 0.87f, -3.17f, 0.71f, -4.36f, -0.47f)
                curveToRelative(-1.37f, -1.37f, -1.37f, -3.58f, 0.0f, -4.95f)
                reflectiveCurveToRelative(3.58f, -1.37f, 4.95f, 0.0f)
                curveToRelative(1.18f, 1.18f, 1.34f, 3.0f, 0.47f, 4.36f)
                lineToRelative(2.09f, 2.09f)
                lineTo(15.47f, 15.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 10.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
        }
        .build()
        return _screenSearchDesktop!!
    }

private var _screenSearchDesktop: ImageVector? = null
