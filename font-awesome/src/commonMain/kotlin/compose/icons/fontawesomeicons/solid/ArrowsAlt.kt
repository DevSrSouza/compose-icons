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

public val SolidGroup.ArrowsAlt: ImageVector
    get() {
        if (_arrowsAlt != null) {
            return _arrowsAlt!!
        }
        _arrowsAlt = Builder(name = "ArrowsAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.2f, 425.77f)
                lineToRelative(-79.2f, 79.2f)
                curveToRelative(-9.37f, 9.37f, -24.57f, 9.37f, -33.94f, 0.0f)
                lineToRelative(-79.2f, -79.2f)
                curveToRelative(-15.12f, -15.12f, -4.41f, -40.97f, 16.97f, -40.97f)
                horizontalLineToRelative(51.16f)
                lineTo(228.0f, 284.0f)
                horizontalLineTo(127.2f)
                verticalLineToRelative(51.16f)
                curveToRelative(0.0f, 21.38f, -25.85f, 32.09f, -40.97f, 16.97f)
                lineTo(7.03f, 272.94f)
                curveToRelative(-9.37f, -9.37f, -9.37f, -24.57f, 0.0f, -33.94f)
                lineTo(86.22f, 159.8f)
                curveToRelative(15.12f, -15.12f, 40.97f, -4.41f, 40.97f, 16.97f)
                verticalLineTo(228.0f)
                horizontalLineTo(228.0f)
                verticalLineTo(127.2f)
                horizontalLineToRelative(-51.23f)
                curveToRelative(-21.38f, 0.0f, -32.09f, -25.85f, -16.97f, -40.97f)
                lineToRelative(79.2f, -79.2f)
                curveToRelative(9.37f, -9.37f, 24.57f, -9.37f, 33.94f, 0.0f)
                lineToRelative(79.2f, 79.2f)
                curveToRelative(15.12f, 15.12f, 4.41f, 40.97f, -16.97f, 40.97f)
                horizontalLineToRelative(-51.16f)
                verticalLineTo(228.0f)
                horizontalLineToRelative(100.8f)
                verticalLineToRelative(-51.16f)
                curveToRelative(0.0f, -21.38f, 25.85f, -32.09f, 40.97f, -16.97f)
                lineToRelative(79.2f, 79.2f)
                curveToRelative(9.37f, 9.37f, 9.37f, 24.57f, 0.0f, 33.94f)
                lineTo(425.77f, 352.2f)
                curveToRelative(-15.12f, 15.12f, -40.97f, 4.41f, -40.97f, -16.97f)
                verticalLineTo(284.0f)
                horizontalLineTo(284.0f)
                verticalLineToRelative(100.8f)
                horizontalLineToRelative(51.23f)
                curveToRelative(21.38f, 0.0f, 32.09f, 25.85f, 16.97f, 40.97f)
                close()
            }
        }
        .build()
        return _arrowsAlt!!
    }

private var _arrowsAlt: ImageVector? = null
