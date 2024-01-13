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

public val SolidGroup.IdCardClip: ImageVector
    get() {
        if (_idCardClip != null) {
            return _idCardClip!!
        }
        _idCardClip = Builder(name = "IdCardClip", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(64.0f, 64.0f)
                horizontalLineTo(192.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(128.0f)
                curveTo(0.0f, 92.7f, 28.7f, 64.0f, 64.0f, 64.0f)
                close()
                moveTo(176.0f, 437.3f)
                curveToRelative(0.0f, 5.9f, 4.8f, 10.7f, 10.7f, 10.7f)
                horizontalLineTo(389.3f)
                curveToRelative(5.9f, 0.0f, 10.7f, -4.8f, 10.7f, -10.7f)
                curveToRelative(0.0f, -29.5f, -23.9f, -53.3f, -53.3f, -53.3f)
                horizontalLineTo(229.3f)
                curveToRelative(-29.5f, 0.0f, -53.3f, 23.9f, -53.3f, 53.3f)
                close()
                moveTo(288.0f, 352.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, -128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, 128.0f)
                close()
            }
        }
        .build()
        return _idCardClip!!
    }

private var _idCardClip: ImageVector? = null
