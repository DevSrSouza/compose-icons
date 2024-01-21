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

public val SolidGroup.HillRockslide: ImageVector
    get() {
        if (_hillRockslide != null) {
            return _hillRockslide!!
        }
        _hillRockslide = Builder(name = "HillRockslide", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.4f, 103.8f)
                lineToRelative(27.0f, 48.0f)
                curveToRelative(2.8f, 5.0f, 8.2f, 8.2f, 13.9f, 8.2f)
                lineToRelative(53.3f, 0.0f)
                curveToRelative(5.8f, 0.0f, 11.1f, -3.1f, 13.9f, -8.2f)
                lineToRelative(27.0f, -48.0f)
                curveToRelative(2.7f, -4.9f, 2.7f, -10.8f, 0.0f, -15.7f)
                lineToRelative(-27.0f, -48.0f)
                curveToRelative(-2.8f, -5.0f, -8.2f, -8.2f, -13.9f, -8.2f)
                horizontalLineTo(293.4f)
                curveToRelative(-5.8f, 0.0f, -11.1f, 3.1f, -13.9f, 8.2f)
                lineToRelative(-27.0f, 48.0f)
                curveToRelative(-2.7f, 4.9f, -2.7f, 10.8f, 0.0f, 15.7f)
                close()
                moveTo(68.3f, 87.0f)
                curveTo(43.1f, 61.8f, 0.0f, 79.7f, 0.0f, 115.3f)
                verticalLineTo(432.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                horizontalLineTo(396.7f)
                curveToRelative(35.6f, 0.0f, 53.5f, -43.1f, 28.3f, -68.3f)
                lineTo(68.3f, 87.0f)
                close()
                moveTo(504.2f, 403.6f)
                curveToRelative(4.9f, 2.7f, 10.8f, 2.7f, 15.7f, 0.0f)
                lineToRelative(48.0f, -27.0f)
                curveToRelative(5.0f, -2.8f, 8.2f, -8.2f, 8.2f, -13.9f)
                verticalLineTo(309.4f)
                curveToRelative(0.0f, -5.8f, -3.1f, -11.1f, -8.2f, -13.9f)
                lineToRelative(-48.0f, -27.0f)
                curveToRelative(-4.9f, -2.7f, -10.8f, -2.7f, -15.7f, 0.0f)
                lineToRelative(-48.0f, 27.0f)
                curveToRelative(-5.0f, 2.8f, -8.2f, 8.2f, -8.2f, 13.9f)
                verticalLineToRelative(53.3f)
                curveToRelative(0.0f, 5.8f, 3.1f, 11.1f, 8.2f, 13.9f)
                lineToRelative(48.0f, 27.0f)
                close()
                moveTo(192.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(384.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _hillRockslide!!
    }

private var _hillRockslide: ImageVector? = null
