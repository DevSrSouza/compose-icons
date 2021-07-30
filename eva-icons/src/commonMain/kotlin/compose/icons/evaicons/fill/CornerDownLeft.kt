package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.CornerDownLeft: ImageVector
    get() {
        if (_cornerDownLeft != null) {
            return _cornerDownLeft!!
        }
        _cornerDownLeft = Builder(name = "CornerDownLeft", defaultWidth = 24.1.dp, defaultHeight =
                24.1.dp, viewportWidth = 24.1f, viewportHeight = 24.1f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0E-4f, 24.0002f)
                lineToRelative(0.1005f, -23.9998f)
                lineToRelative(23.9998f, 0.1005f)
                lineToRelative(-0.1005f, 23.9998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineToRelative(0.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.29f, 0.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.71f, 0.29f)
                lineToRelative(-8.92f, 0.0f)
                lineToRelative(2.69f, -3.39f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.25f, 7.44f)
                lineToRelative(-4.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.25f)
                lineToRelative(4.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, 0.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.62f, -0.22f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.15f, -1.41f)
                lineTo(8.14f, 14.07f)
                lineToRelative(8.92f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _cornerDownLeft!!
    }

private var _cornerDownLeft: ImageVector? = null
