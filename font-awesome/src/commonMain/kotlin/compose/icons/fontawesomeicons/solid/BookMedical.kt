package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.BookMedical: ImageVector
    get() {
        if (_bookMedical != null) {
            return _bookMedical!!
        }
        _bookMedical = Builder(name = "BookMedical", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 358.4f)
                lineTo(448.0f, 25.6f)
                curveToRelative(0.0f, -16.0f, -9.6f, -25.6f, -25.6f, -25.6f)
                lineTo(96.0f, 0.0f)
                curveTo(41.6f, 0.0f, 0.0f, 41.6f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 54.4f, 41.6f, 96.0f, 96.0f, 96.0f)
                horizontalLineToRelative(326.4f)
                curveToRelative(12.8f, 0.0f, 25.6f, -9.6f, 25.6f, -25.6f)
                verticalLineToRelative(-16.0f)
                quadToRelative(0.0f, -9.6f, -9.6f, -19.2f)
                curveToRelative(-3.2f, -16.0f, -3.2f, -60.8f, 0.0f, -73.6f)
                quadToRelative(9.6f, -4.8f, 9.6f, -19.2f)
                close()
                moveTo(144.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(-56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-56.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-56.0f)
                horizontalLineToRelative(-56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                close()
                moveTo(380.8f, 448.0f)
                lineTo(96.0f, 448.0f)
                curveToRelative(-19.2f, 0.0f, -32.0f, -12.8f, -32.0f, -32.0f)
                reflectiveCurveToRelative(16.0f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(284.8f)
                close()
            }
        }
        .build()
        return _bookMedical!!
    }

private var _bookMedical: ImageVector? = null
