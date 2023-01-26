package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.RecordVoiceOver: ImageVector
    get() {
        if (_recordVoiceOver != null) {
            return _recordVoiceOver!!
        }
        _recordVoiceOver = Builder(name = "RecordVoiceOver", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f)
                close()
                moveTo(15.47f, 7.77f)
                curveToRelative(0.32f, 0.79f, 0.32f, 1.67f, 0.0f, 2.46f)
                curveToRelative(-0.19f, 0.47f, -0.11f, 1.0f, 0.25f, 1.36f)
                lineToRelative(0.03f, 0.03f)
                curveToRelative(0.58f, 0.58f, 1.57f, 0.46f, 1.95f, -0.27f)
                curveToRelative(0.76f, -1.45f, 0.76f, -3.15f, -0.02f, -4.66f)
                curveToRelative(-0.38f, -0.74f, -1.38f, -0.88f, -1.97f, -0.29f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(-0.34f, 0.35f, -0.42f, 0.89f, -0.23f, 1.36f)
                close()
                moveTo(19.18f, 2.89f)
                curveToRelative(-0.4f, 0.4f, -0.46f, 1.02f, -0.13f, 1.48f)
                curveToRelative(1.97f, 2.74f, 1.96f, 6.41f, -0.03f, 9.25f)
                curveToRelative(-0.32f, 0.45f, -0.25f, 1.07f, 0.14f, 1.46f)
                lineToRelative(0.03f, 0.03f)
                curveToRelative(0.49f, 0.49f, 1.32f, 0.45f, 1.74f, -0.1f)
                curveToRelative(2.75f, -3.54f, 2.76f, -8.37f, 0.0f, -12.02f)
                curveToRelative(-0.42f, -0.55f, -1.26f, -0.59f, -1.75f, -0.1f)
                close()
            }
        }
        .build()
        return _recordVoiceOver!!
    }

private var _recordVoiceOver: ImageVector? = null
