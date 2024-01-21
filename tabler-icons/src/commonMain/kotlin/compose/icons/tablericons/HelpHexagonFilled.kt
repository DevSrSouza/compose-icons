package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.HelpHexagonFilled: ImageVector
    get() {
        if (_helpHexagonFilled != null) {
            return _helpHexagonFilled!!
        }
        _helpHexagonFilled = Builder(name = "HelpHexagonFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.425f, 1.414f)
                arcToRelative(3.33f, 3.33f, 0.0f, false, true, 3.026f, -0.097f)
                lineToRelative(0.19f, 0.097f)
                lineToRelative(6.775f, 3.995f)
                lineToRelative(0.096f, 0.063f)
                lineToRelative(0.092f, 0.077f)
                lineToRelative(0.107f, 0.075f)
                arcToRelative(3.224f, 3.224f, 0.0f, false, true, 1.266f, 2.188f)
                lineToRelative(0.018f, 0.202f)
                lineToRelative(0.005f, 0.204f)
                verticalLineToRelative(7.284f)
                curveToRelative(0.0f, 1.106f, -0.57f, 2.129f, -1.454f, 2.693f)
                lineToRelative(-0.17f, 0.1f)
                lineToRelative(-6.803f, 4.302f)
                curveToRelative(-0.918f, 0.504f, -2.019f, 0.535f, -3.004f, 0.068f)
                lineToRelative(-0.196f, -0.1f)
                lineToRelative(-6.695f, -4.237f)
                arcToRelative(3.225f, 3.225f, 0.0f, false, true, -1.671f, -2.619f)
                lineToRelative(-0.007f, -0.207f)
                verticalLineToRelative(-7.285f)
                curveToRelative(0.0f, -1.106f, 0.57f, -2.128f, 1.476f, -2.705f)
                lineToRelative(6.95f, -4.098f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.986f, 0.0f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                close()
                moveTo(13.368f, 8.327f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, false, -3.631f, 0.728f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.44f, 1.383f)
                lineToRelative(0.171f, -0.18f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, true, 1.11f, -0.15f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.34f, 1.886f)
                lineToRelative(-0.232f, 0.012f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.111f, 1.994f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.371f, -5.673f)
                close()
            }
        }
        .build()
        return _helpHexagonFilled!!
    }

private var _helpHexagonFilled: ImageVector? = null
