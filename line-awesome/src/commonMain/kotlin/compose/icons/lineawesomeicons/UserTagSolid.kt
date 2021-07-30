package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.UserTagSolid: ImageVector
    get() {
        if (_userTagSolid != null) {
            return _userTagSolid!!
        }
        _userTagSolid = Builder(name = "UserTagSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(12.1f, 5.0f, 9.0f, 8.1f, 9.0f, 12.0f)
                curveTo(9.0f, 14.4375f, 10.21f, 16.5615f, 12.0703f, 17.8125f)
                curveTo(8.51f, 19.3473f, 6.0f, 22.8936f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.6f, 11.6f, 19.0f, 16.0f, 19.0f)
                curveTo(19.9f, 19.0f, 23.0f, 15.9f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1f, 19.9f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.8f, 7.0f, 21.0f, 9.2f, 21.0f, 12.0f)
                curveTo(21.0f, 14.8f, 18.8f, 17.0f, 16.0f, 17.0f)
                curveTo(13.2f, 17.0f, 11.0f, 14.8f, 11.0f, 12.0f)
                curveTo(11.0f, 9.2f, 13.2f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(21.0f, 19.0f)
                curveTo(19.9f, 19.0f, 19.0f, 19.9f, 19.0f, 21.0f)
                lineTo(19.0f, 25.4004f)
                lineTo(25.0f, 31.4004f)
                curveTo(25.4f, 31.8004f, 25.9004f, 32.0f, 26.4004f, 32.0f)
                curveTo(26.9004f, 32.0f, 27.4008f, 31.8004f, 27.8008f, 31.4004f)
                lineTo(31.4004f, 27.8008f)
                curveTo(31.8004f, 27.4008f, 32.0f, 26.9004f, 32.0f, 26.4004f)
                curveTo(32.0f, 25.9004f, 31.8004f, 25.4f, 31.4004f, 25.0f)
                lineTo(25.4004f, 19.0f)
                lineTo(21.0f, 19.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(24.5996f, 21.0f)
                lineTo(30.0f, 26.4004f)
                lineTo(26.4004f, 30.0f)
                lineTo(21.0f, 24.5996f)
                lineTo(21.0f, 21.0f)
                close()
                moveTo(23.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 24.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 22.0f)
                close()
            }
        }
        .build()
        return _userTagSolid!!
    }

private var _userTagSolid: ImageVector? = null
