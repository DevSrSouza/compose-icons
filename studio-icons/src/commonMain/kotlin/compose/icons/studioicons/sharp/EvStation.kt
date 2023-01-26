package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.EvStation: ImageVector
    get() {
        if (_evStation != null) {
            return _evStation!!
        }
        _evStation = Builder(name = "EvStation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.77f, 7.23f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(-3.72f, -3.72f)
                lineTo(15.0f, 4.56f)
                lineToRelative(2.11f, 2.11f)
                curveToRelative(-1.05f, 0.4f, -1.76f, 1.47f, -1.58f, 2.71f)
                curveToRelative(0.16f, 1.1f, 1.1f, 1.99f, 2.2f, 2.11f)
                curveToRelative(0.47f, 0.05f, 0.88f, -0.03f, 1.27f, -0.2f)
                verticalLineToRelative(8.21f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -0.69f, -0.28f, -1.32f, -0.73f, -1.77f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(8.0f, 18.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(6.0f)
                lineTo(10.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-4.0f, 7.0f)
                close()
            }
        }
        .build()
        return _evStation!!
    }

private var _evStation: ImageVector? = null
