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

public val SolidGroup.ChevronRight: ImageVector
    get() {
        if (_chevronRight != null) {
            return _chevronRight!!
        }
        _chevronRight = Builder(name = "ChevronRight", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(285.48f, 272.97f)
                lineTo(91.13f, 467.31f)
                curveToRelative(-9.37f, 9.37f, -24.57f, 9.37f, -33.94f, 0.0f)
                lineToRelative(-22.67f, -22.67f)
                curveToRelative(-9.36f, -9.36f, -9.38f, -24.52f, -0.04f, -33.9f)
                lineTo(188.51f, 256.0f)
                lineTo(34.48f, 101.25f)
                curveToRelative(-9.34f, -9.38f, -9.32f, -24.54f, 0.04f, -33.9f)
                lineToRelative(22.67f, -22.67f)
                curveToRelative(9.37f, -9.37f, 24.57f, -9.37f, 33.94f, 0.0f)
                lineTo(285.48f, 239.03f)
                curveToRelative(9.37f, 9.37f, 9.37f, 24.57f, 0.0f, 33.94f)
                close()
            }
        }
        .build()
        return _chevronRight!!
    }

private var _chevronRight: ImageVector? = null
