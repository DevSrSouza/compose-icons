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

public val SolidGroup.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(511.33f, 20.8f)
                curveToRelative(-11.61f, 38.7f, -34.31f, 111.7f, -61.3f, 187.7f)
                curveToRelative(7.0f, 2.09f, 13.4f, 4.0f, 18.61f, 5.59f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, true, 9.5f, 22.91f)
                curveToRelative(-22.11f, 42.3f, -82.69f, 152.79f, -142.48f, 214.4f)
                curveToRelative(-1.0f, 1.09f, -2.0f, 2.5f, -3.0f, 3.5f)
                arcTo(194.83f, 194.83f, 0.0f, true, true, 57.08f, 179.41f)
                curveToRelative(1.0f, -1.0f, 2.41f, -2.0f, 3.5f, -3.0f)
                curveToRelative(61.6f, -59.91f, 171.97f, -120.4f, 214.37f, -142.5f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, true, 22.9f, 9.5f)
                curveToRelative(1.59f, 5.09f, 3.5f, 11.59f, 5.59f, 18.59f)
                curveTo(379.35f, 35.01f, 452.43f, 12.3f, 491.13f, 0.71f)
                arcTo(16.18f, 16.18f, 0.0f, false, true, 511.33f, 20.8f)
                close()
                moveTo(319.95f, 320.0f)
                arcTo(127.98f, 127.98f, 0.0f, true, false, 191.97f, 448.0f)
                arcTo(127.98f, 127.98f, 0.0f, false, false, 319.95f, 320.0f)
                close()
                moveTo(191.97f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f)
                arcTo(31.96f, 31.96f, 0.0f, false, true, 191.97f, 288.0f)
                close()
                moveTo(223.97f, 368.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.05f, 16.05f, 0.0f, false, true, 223.97f, 368.0f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
