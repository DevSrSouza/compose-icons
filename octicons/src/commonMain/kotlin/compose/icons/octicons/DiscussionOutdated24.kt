package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.DiscussionOutdated24: ImageVector
    get() {
        if (_discussionOutdated24 != null) {
            return _discussionOutdated24!!
        }
        _discussionOutdated24 = Builder(name = "DiscussionOutdated24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.75f)
                curveTo(0.0f, 1.783f, 0.784f, 1.0f, 1.75f, 1.0f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.967f, 0.0f, 1.75f, 0.783f, 1.75f, 1.75f)
                verticalLineToRelative(9.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 14.0f)
                lineTo(8.061f, 14.0f)
                lineToRelative(-2.574f, 2.573f)
                arcTo(1.457f, 1.457f, 0.0f, false, true, 3.0f, 15.543f)
                lineTo(3.0f, 14.0f)
                lineTo(1.75f, 14.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 12.25f)
                close()
                moveTo(1.75f, 2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.189f)
                lineToRelative(2.72f, -2.719f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(22.25f, 8.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(9.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 22.25f, 20.0f)
                lineTo(21.0f, 20.0f)
                verticalLineToRelative(1.543f)
                arcToRelative(1.457f, 1.457f, 0.0f, false, true, -2.487f, 1.03f)
                lineTo(15.939f, 20.0f)
                lineTo(10.75f, 20.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 9.0f, 18.25f)
                verticalLineToRelative(-1.465f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(1.465f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.199f, 0.0f, 0.39f, 0.079f, 0.53f, 0.22f)
                lineToRelative(2.72f, 2.719f)
                lineTo(19.5f, 19.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(8.5f, 4.75f)
                verticalLineToRelative(3.14f)
                lineToRelative(1.15f, 0.488f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, true, 0.037f, 0.017f)
                lineToRelative(1.393f, 0.681f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.66f, 1.348f)
                lineToRelative(-1.374f, -0.673f)
                lineToRelative(-1.589f, -0.674f)
                arcTo(0.751f, 0.751f, 0.0f, false, true, 7.0f, 8.386f)
                lineTo(7.0f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
            }
        }
        .build()
        return _discussionOutdated24!!
    }

private var _discussionOutdated24: ImageVector? = null
