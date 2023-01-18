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

public val RemixIcons.AppStoreLine: ImageVector
    get() {
        if (_appStoreLine != null) {
            return _appStoreLine!!
        }
        _appStoreLine = Builder(name = "AppStoreLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(8.823f, 15.343f)
                lineToRelative(-0.79f, 1.37f)
                arcToRelative(0.823f, 0.823f, 0.0f, true, true, -1.428f, -0.822f)
                lineToRelative(0.589f, -1.016f)
                curveToRelative(0.66f, -0.206f, 1.201f, -0.048f, 1.629f, 0.468f)
                close()
                moveTo(13.21f, 8.66f)
                lineToRelative(2.423f, 4.194f)
                horizontalLineToRelative(2.141f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.823f, 0.822f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.823f, 0.823f)
                horizontalLineToRelative(-1.19f)
                lineToRelative(0.803f, 1.391f)
                arcToRelative(0.824f, 0.824f, 0.0f, false, true, -1.427f, 0.823f)
                lineToRelative(-3.04f, -5.266f)
                curveToRelative(-0.69f, -1.19f, -0.198f, -2.383f, 0.29f, -2.787f)
                close()
                moveTo(13.488f, 5.616f)
                curveToRelative(0.395f, 0.226f, 0.528f, 0.73f, 0.302f, 1.125f)
                lineToRelative(-3.528f, 6.109f)
                horizontalLineToRelative(2.553f)
                curveToRelative(0.826f, 0.0f, 1.29f, 0.972f, 0.931f, 1.645f)
                horizontalLineToRelative(-7.48f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.822f, -0.823f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.822f, -0.822f)
                horizontalLineToRelative(2.097f)
                lineToRelative(2.685f, -4.653f)
                lineToRelative(-0.838f, -1.456f)
                arcToRelative(0.824f, 0.824f, 0.0f, false, true, 1.427f, -0.823f)
                lineToRelative(0.359f, 0.633f)
                lineToRelative(0.367f, -0.633f)
                arcToRelative(0.823f, 0.823f, 0.0f, false, true, 1.125f, -0.302f)
                close()
            }
        }
        .build()
        return _appStoreLine!!
    }

private var _appStoreLine: ImageVector? = null
