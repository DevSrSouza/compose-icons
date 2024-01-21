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

public val SolidGroup.Vault: ImageVector
    get() {
        if (_vault != null) {
            return _vault!!
        }
        _vault = Builder(name = "Vault", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(80.0f, 480.0f)
                lineToRelative(16.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                lineToRelative(16.0f, -32.0f)
                lineTo(400.0f, 480.0f)
                lineToRelative(16.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                lineToRelative(16.0f, -32.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(576.0f, 64.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(224.0f, 320.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, -160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, 160.0f)
                close()
                moveTo(224.0f, 80.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, true, true, 0.0f, 320.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, true, true, 0.0f, -320.0f)
                close()
                moveTo(480.0f, 221.3f)
                lineTo(480.0f, 336.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(448.0f, 221.3f)
                curveToRelative(-18.6f, -6.6f, -32.0f, -24.4f, -32.0f, -45.3f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                curveToRelative(0.0f, 20.9f, -13.4f, 38.7f, -32.0f, 45.3f)
                close()
            }
        }
        .build()
        return _vault!!
    }

private var _vault: ImageVector? = null
