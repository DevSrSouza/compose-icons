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

public val SolidGroup.BookTanakh: ImageVector
    get() {
        if (_bookTanakh != null) {
            return _bookTanakh!!
        }
        _bookTanakh = Builder(name = "BookTanakh", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineTo(448.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                lineTo(64.0f, 512.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(32.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(0.0f, 32.0f)
                curveTo(0.0f, 14.3f, 14.3f, 0.0f, 32.0f, 0.0f)
                lineTo(64.0f, 0.0f)
                lineTo(352.0f, 0.0f)
                close()
                moveTo(352.0f, 384.0f)
                lineTo(96.0f, 384.0f)
                verticalLineToRelative(64.0f)
                lineTo(352.0f, 448.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(138.7f, 208.0f)
                lineToRelative(13.9f, 24.0f)
                lineTo(124.9f, 232.0f)
                lineToRelative(13.9f, -24.0f)
                close()
                moveTo(124.8f, 184.0f)
                lineTo(97.1f, 232.0f)
                curveToRelative(-6.2f, 10.7f, 1.5f, 24.0f, 13.9f, 24.0f)
                horizontalLineToRelative(55.4f)
                lineToRelative(27.7f, 48.0f)
                curveToRelative(6.2f, 10.7f, 21.6f, 10.7f, 27.7f, 0.0f)
                lineToRelative(27.7f, -48.0f)
                lineTo(305.0f, 256.0f)
                curveToRelative(12.3f, 0.0f, 20.0f, -13.3f, 13.9f, -24.0f)
                lineToRelative(-27.7f, -48.0f)
                lineToRelative(27.7f, -48.0f)
                curveToRelative(6.2f, -10.7f, -1.5f, -24.0f, -13.9f, -24.0f)
                lineTo(249.6f, 112.0f)
                lineTo(221.9f, 64.0f)
                curveToRelative(-6.2f, -10.7f, -21.6f, -10.7f, -27.7f, 0.0f)
                lineToRelative(-27.7f, 48.0f)
                lineTo(111.0f, 112.0f)
                curveToRelative(-12.3f, 0.0f, -20.0f, 13.3f, -13.9f, 24.0f)
                lineToRelative(27.7f, 48.0f)
                close()
                moveTo(152.5f, 184.0f)
                lineToRelative(27.7f, -48.0f)
                horizontalLineToRelative(55.4f)
                lineToRelative(27.7f, 48.0f)
                lineToRelative(-27.7f, 48.0f)
                lineTo(180.3f, 232.0f)
                lineToRelative(-27.7f, -48.0f)
                close()
                moveTo(152.5f, 136.0f)
                lineToRelative(-13.9f, 24.0f)
                lineToRelative(-13.9f, -24.0f)
                horizontalLineToRelative(27.7f)
                close()
                moveTo(194.1f, 112.0f)
                lineTo(208.0f, 88.0f)
                lineToRelative(13.9f, 24.0f)
                lineTo(194.1f, 112.0f)
                close()
                moveTo(263.4f, 136.0f)
                horizontalLineToRelative(27.7f)
                lineToRelative(-13.9f, 24.0f)
                lineToRelative(-13.9f, -24.0f)
                close()
                moveTo(277.3f, 208.0f)
                lineToRelative(13.9f, 24.0f)
                lineTo(263.4f, 232.0f)
                lineToRelative(13.9f, -24.0f)
                close()
                moveTo(221.9f, 256.0f)
                lineTo(208.0f, 280.0f)
                lineToRelative(-13.9f, -24.0f)
                horizontalLineToRelative(27.7f)
                close()
            }
        }
        .build()
        return _bookTanakh!!
    }

private var _bookTanakh: ImageVector? = null
