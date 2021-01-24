package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CommentMedical: ImageVector
    get() {
        if (_commentMedical != null) {
            return _commentMedical!!
        }
        _commentMedical = Builder(name = "CommentMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveTo(114.62f, 32.0f, 0.0f, 125.12f, 0.0f, 240.0f)
                curveToRelative(0.0f, 49.56f, 21.41f, 95.0f, 57.0f, 130.74f)
                curveTo(44.46f, 421.05f, 2.7f, 466.0f, 2.2f, 466.5f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 480.0f)
                curveToRelative(66.26f, 0.0f, 116.0f, -31.75f, 140.6f, -51.38f)
                arcTo(304.66f, 304.66f, 0.0f, false, false, 256.0f, 448.0f)
                curveToRelative(141.39f, 0.0f, 256.0f, -93.12f, 256.0f, -208.0f)
                reflectiveCurveTo(397.39f, 32.0f, 256.0f, 32.0f)
                close()
                moveTo(352.0f, 264.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-56.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-56.0f)
                horizontalLineToRelative(-56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(-56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _commentMedical!!
    }

private var _commentMedical: ImageVector? = null
