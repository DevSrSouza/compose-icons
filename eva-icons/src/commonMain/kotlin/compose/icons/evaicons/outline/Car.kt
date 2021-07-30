package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6f, 11.22f)
                lineTo(17.0f, 7.52f)
                lineTo(17.0f, 5.0f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, false, -1.81f, -2.0f)
                lineTo(3.79f, 3.0f)
                arcTo(1.91f, 1.91f, 0.0f, false, false, 2.0f, 5.0f)
                lineTo(2.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.2f, 16.88f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 8.8f, 17.0f)
                horizontalLineToRelative(6.36f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 5.64f, 0.0f)
                lineTo(21.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(22.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.6f, 11.22f)
                close()
                moveTo(20.0f, 12.48f)
                lineTo(20.0f, 15.0f)
                lineTo(17.0f, 15.0f)
                lineTo(17.0f, 10.08f)
                close()
                moveTo(7.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 18.0f)
                close()
                moveTo(12.0f, 15.0f)
                lineTo(4.0f, 15.0f)
                lineTo(4.0f, 5.0f)
                lineTo(15.0f, 5.0f)
                lineToRelative(0.0f, 10.0f)
                close()
                moveTo(19.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 18.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
