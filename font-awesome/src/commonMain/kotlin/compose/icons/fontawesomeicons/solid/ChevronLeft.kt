package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ChevronLeft: ImageVector
    get() {
        if (_chevronLeft != null) {
            return _chevronLeft!!
        }
        _chevronLeft = Builder(name = "ChevronLeft", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.52f, 239.03f)
                lineTo(228.87f, 44.69f)
                curveToRelative(9.37f, -9.37f, 24.57f, -9.37f, 33.94f, 0.0f)
                lineToRelative(22.67f, 22.67f)
                curveToRelative(9.36f, 9.36f, 9.37f, 24.52f, 0.04f, 33.9f)
                lineTo(131.49f, 256.0f)
                lineToRelative(154.02f, 154.75f)
                curveToRelative(9.34f, 9.38f, 9.32f, 24.54f, -0.04f, 33.9f)
                lineToRelative(-22.67f, 22.67f)
                curveToRelative(-9.37f, 9.37f, -24.57f, 9.37f, -33.94f, 0.0f)
                lineTo(34.52f, 272.97f)
                curveToRelative(-9.37f, -9.37f, -9.37f, -24.57f, 0.0f, -33.94f)
                close()
            }
        }
        .build()
        return _chevronLeft!!
    }

private var _chevronLeft: ImageVector? = null
