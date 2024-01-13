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

public val SolidGroup.UserInjured: ImageVector
    get() {
        if (_userInjured != null) {
            return _userInjured!!
        }
        _userInjured = Builder(name = "UserInjured", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 80.0f)
                lineTo(342.7f, 80.0f)
                curveToRelative(-7.9f, -19.5f, -20.4f, -36.5f, -36.2f, -49.9f)
                lineTo(240.0f, 80.0f)
                close()
                moveTo(277.7f, 11.8f)
                curveTo(261.3f, 4.2f, 243.2f, 0.0f, 224.0f, 0.0f)
                curveToRelative(-53.7f, 0.0f, -99.7f, 33.1f, -118.7f, 80.0f)
                horizontalLineToRelative(81.4f)
                lineToRelative(91.0f, -68.2f)
                close()
                moveTo(224.0f, 256.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                curveToRelative(0.0f, -5.4f, -0.3f, -10.8f, -1.0f, -16.0f)
                lineTo(97.0f, 112.0f)
                curveToRelative(-0.7f, 5.2f, -1.0f, 10.6f, -1.0f, 16.0f)
                curveToRelative(0.0f, 70.7f, 57.3f, 128.0f, 128.0f, 128.0f)
                close()
                moveTo(124.0f, 312.4f)
                curveToRelative(-9.7f, 3.1f, -19.1f, 7.0f, -28.0f, 11.7f)
                lineTo(96.0f, 512.0f)
                lineTo(243.7f, 512.0f)
                lineTo(181.5f, 408.2f)
                lineTo(124.0f, 312.4f)
                close()
                moveTo(157.0f, 305.2f)
                lineTo(204.3f, 384.0f)
                lineTo(272.0f, 384.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 18.0f, -6.0f, 34.6f, -16.0f, 48.0f)
                horizontalLineToRelative(82.3f)
                curveToRelative(16.4f, 0.0f, 29.7f, -13.3f, 29.7f, -29.7f)
                curveTo(448.0f, 383.8f, 368.2f, 304.0f, 269.7f, 304.0f)
                lineTo(178.3f, 304.0f)
                curveToRelative(-7.2f, 0.0f, -14.3f, 0.4f, -21.3f, 1.3f)
                close()
                moveTo(0.0f, 482.3f)
                curveTo(0.0f, 498.7f, 13.3f, 512.0f, 29.7f, 512.0f)
                lineTo(64.0f, 512.0f)
                lineTo(64.0f, 345.4f)
                curveTo(24.9f, 378.1f, 0.0f, 427.3f, 0.0f, 482.3f)
                close()
                moveTo(320.0f, 464.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(223.5f, 416.0f)
                lineToRelative(57.1f, 95.2f)
                curveTo(303.0f, 507.2f, 320.0f, 487.6f, 320.0f, 464.0f)
                close()
            }
        }
        .build()
        return _userInjured!!
    }

private var _userInjured: ImageVector? = null
