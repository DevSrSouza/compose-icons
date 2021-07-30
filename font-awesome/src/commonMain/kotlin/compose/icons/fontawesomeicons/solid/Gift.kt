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

public val SolidGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(160.0f)
                lineTo(224.0f, 320.0f)
                lineTo(32.0f, 320.0f)
                verticalLineToRelative(128.0f)
                close()
                moveTo(288.0f, 480.0f)
                horizontalLineToRelative(160.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(480.0f, 320.0f)
                lineTo(288.0f, 320.0f)
                verticalLineToRelative(160.0f)
                close()
                moveTo(480.0f, 160.0f)
                horizontalLineToRelative(-42.1f)
                curveToRelative(6.2f, -12.1f, 10.1f, -25.5f, 10.1f, -40.0f)
                curveToRelative(0.0f, -48.5f, -39.5f, -88.0f, -88.0f, -88.0f)
                curveToRelative(-41.6f, 0.0f, -68.5f, 21.3f, -103.0f, 68.3f)
                curveToRelative(-34.5f, -47.0f, -61.4f, -68.3f, -103.0f, -68.3f)
                curveToRelative(-48.5f, 0.0f, -88.0f, 39.5f, -88.0f, 88.0f)
                curveToRelative(0.0f, 14.5f, 3.8f, 27.9f, 10.1f, 40.0f)
                lineTo(32.0f, 160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(480.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-80.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(153.9f, 160.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                reflectiveCurveToRelative(17.9f, -40.0f, 40.0f, -40.0f)
                curveToRelative(19.9f, 0.0f, 34.6f, 3.3f, 86.1f, 80.0f)
                horizontalLineToRelative(-86.1f)
                close()
                moveTo(360.0f, 160.0f)
                horizontalLineToRelative(-86.1f)
                curveToRelative(51.4f, -76.5f, 65.7f, -80.0f, 86.1f, -80.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, 17.9f, 40.0f, 40.0f)
                reflectiveCurveToRelative(-17.9f, 40.0f, -40.0f, 40.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
