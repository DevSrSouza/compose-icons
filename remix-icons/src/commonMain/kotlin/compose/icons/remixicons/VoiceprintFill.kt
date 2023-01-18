package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.VoiceprintFill: ImageVector
    get() {
        if (_voiceprintFill != null) {
            return _voiceprintFill!!
        }
        _voiceprintFill = Builder(name = "VoiceprintFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 7.0f)
                close()
                moveTo(1.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                lineTo(1.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(18.0f)
                lineTo(9.0f, 20.0f)
                lineTo(9.0f, 2.0f)
                close()
                moveTo(13.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 4.0f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 7.0f)
                close()
                moveTo(21.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _voiceprintFill!!
    }

private var _voiceprintFill: ImageVector? = null
