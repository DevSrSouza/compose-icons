package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.ObjectGroup: ImageVector
    get() {
        if (_objectGroup != null) {
            return _objectGroup!!
        }
        _objectGroup = Builder(name = "ObjectGroup", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 115.8f)
                curveTo(38.2f, 107.0f, 32.0f, 94.2f, 32.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                curveToRelative(14.2f, 0.0f, 27.0f, 6.2f, 35.8f, 16.0f)
                lineTo(460.2f, 48.0f)
                curveToRelative(8.8f, -9.8f, 21.6f, -16.0f, 35.8f, -16.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                curveToRelative(0.0f, 14.2f, -6.2f, 27.0f, -16.0f, 35.8f)
                lineTo(528.0f, 396.2f)
                curveToRelative(9.8f, 8.8f, 16.0f, 21.6f, 16.0f, 35.8f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                curveToRelative(-14.2f, 0.0f, -27.0f, -6.2f, -35.8f, -16.0f)
                lineTo(115.8f, 464.0f)
                curveToRelative(-8.8f, 9.8f, -21.6f, 16.0f, -35.8f, 16.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                curveToRelative(0.0f, -14.2f, 6.2f, -27.0f, 16.0f, -35.8f)
                lineTo(48.0f, 115.8f)
                close()
                moveTo(125.3f, 96.0f)
                curveToRelative(-4.8f, 13.6f, -15.6f, 24.4f, -29.3f, 29.3f)
                lineTo(96.0f, 386.7f)
                curveToRelative(13.6f, 4.8f, 24.4f, 15.6f, 29.3f, 29.3f)
                lineTo(450.7f, 416.0f)
                curveToRelative(4.8f, -13.6f, 15.6f, -24.4f, 29.3f, -29.3f)
                lineTo(480.0f, 125.3f)
                curveToRelative(-13.6f, -4.8f, -24.4f, -15.6f, -29.3f, -29.3f)
                lineTo(125.3f, 96.0f)
                close()
                moveTo(128.0f, 160.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(288.0f, 128.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(160.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(128.0f, 160.0f)
                close()
                moveTo(256.0f, 320.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(352.0f, 224.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(288.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(256.0f, 320.0f)
                close()
            }
        }
        .build()
        return _objectGroup!!
    }

private var _objectGroup: ImageVector? = null
