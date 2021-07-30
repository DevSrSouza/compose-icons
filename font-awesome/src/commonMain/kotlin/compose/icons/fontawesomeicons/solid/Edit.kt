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

public val SolidGroup.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(402.6f, 83.2f)
                lineToRelative(90.2f, 90.2f)
                curveToRelative(3.8f, 3.8f, 3.8f, 10.0f, 0.0f, 13.8f)
                lineTo(274.4f, 405.6f)
                lineToRelative(-92.8f, 10.3f)
                curveToRelative(-12.4f, 1.4f, -22.9f, -9.1f, -21.5f, -21.5f)
                lineToRelative(10.3f, -92.8f)
                lineTo(388.8f, 83.2f)
                curveToRelative(3.8f, -3.8f, 10.0f, -3.8f, 13.8f, 0.0f)
                close()
                moveTo(564.6f, 60.3f)
                lineToRelative(-48.8f, -48.8f)
                curveToRelative(-15.2f, -15.2f, -39.9f, -15.2f, -55.2f, 0.0f)
                lineToRelative(-35.4f, 35.4f)
                curveToRelative(-3.8f, 3.8f, -3.8f, 10.0f, 0.0f, 13.8f)
                lineToRelative(90.2f, 90.2f)
                curveToRelative(3.8f, 3.8f, 10.0f, 3.8f, 13.8f, 0.0f)
                lineToRelative(35.4f, -35.4f)
                curveToRelative(15.2f, -15.3f, 15.2f, -40.0f, 0.0f, -55.2f)
                close()
                moveTo(384.0f, 346.2f)
                lineTo(384.0f, 448.0f)
                lineTo(64.0f, 448.0f)
                lineTo(64.0f, 128.0f)
                horizontalLineToRelative(229.8f)
                curveToRelative(3.2f, 0.0f, 6.2f, -1.3f, 8.5f, -3.5f)
                lineToRelative(40.0f, -40.0f)
                curveToRelative(7.6f, -7.6f, 2.2f, -20.5f, -8.5f, -20.5f)
                lineTo(48.0f, 64.0f)
                curveTo(21.5f, 64.0f, 0.0f, 85.5f, 0.0f, 112.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(448.0f, 306.2f)
                curveToRelative(0.0f, -10.7f, -12.9f, -16.0f, -20.5f, -8.5f)
                lineToRelative(-40.0f, 40.0f)
                curveToRelative(-2.2f, 2.3f, -3.5f, 5.3f, -3.5f, 8.5f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
