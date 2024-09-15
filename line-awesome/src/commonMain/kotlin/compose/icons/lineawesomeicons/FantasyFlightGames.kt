package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.FantasyFlightGames: ImageVector
    get() {
        if (_fantasyFlightGames != null) {
            return _fantasyFlightGames!!
        }
        _fantasyFlightGames = Builder(name = "FantasyFlightGames", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineTo(2.0f, 16.0f)
                lineTo(16.0f, 30.0f)
                lineTo(30.0f, 16.0f)
                lineTo(16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.01f)
                lineTo(28.0f, 16.0f)
                lineTo(16.0f, 28.0f)
                lineTo(4.0f, 16.0f)
                lineTo(16.0f, 4.01f)
                close()
                moveTo(16.0f, 6.0f)
                lineTo(6.0f, 16.0f)
                lineTo(16.0f, 26.0f)
                lineTo(26.0f, 16.0f)
                lineTo(16.0f, 6.0f)
                close()
                moveTo(16.311f, 10.01f)
                curveTo(16.988f, 10.06f, 17.63f, 10.313f, 18.201f, 10.738f)
                curveTo(19.31f, 11.565f, 21.006f, 13.402f, 21.014f, 13.402f)
                curveTo(21.039f, 13.435f, 21.064f, 13.534f, 21.039f, 13.559f)
                curveTo(20.526f, 14.097f, 20.013f, 14.626f, 19.525f, 15.131f)
                curveTo(17.978f, 13.667f, 17.688f, 13.393f, 17.324f, 13.137f)
                curveTo(16.521f, 12.566f, 15.455f, 12.682f, 14.752f, 13.369f)
                curveTo(14.653f, 13.468f, 14.669f, 13.526f, 14.752f, 13.609f)
                curveTo(14.884f, 13.75f, 16.025f, 14.89f, 16.34f, 15.23f)
                curveTo(15.802f, 15.759f, 15.273f, 16.273f, 14.727f, 16.803f)
                curveTo(14.181f, 16.232f, 13.618f, 15.645f, 13.072f, 15.074f)
                curveTo(12.104f, 16.034f, 11.186f, 16.937f, 10.275f, 17.838f)
                curveTo(9.654f, 17.226f, 9.033f, 16.604f, 8.412f, 15.992f)
                curveTo(8.503f, 15.901f, 8.95f, 15.438f, 12.781f, 11.582f)
                curveTo(13.95f, 10.403f, 15.181f, 9.926f, 16.311f, 10.01f)
                close()
                moveTo(21.734f, 14.189f)
                curveTo(22.355f, 14.793f, 22.968f, 15.39f, 23.588f, 16.002f)
                curveTo(22.678f, 16.945f, 19.89f, 19.742f, 19.037f, 20.594f)
                curveTo(17.431f, 22.19f, 15.503f, 22.314f, 14.195f, 21.52f)
                curveTo(13.194f, 20.908f, 12.417f, 20.062f, 10.895f, 18.49f)
                curveTo(11.441f, 17.927f, 11.971f, 17.392f, 12.5f, 16.854f)
                curveTo(13.989f, 18.294f, 14.172f, 18.475f, 14.52f, 18.756f)
                curveTo(15.356f, 19.418f, 16.446f, 19.369f, 17.207f, 18.674f)
                curveTo(17.372f, 18.517f, 17.372f, 18.508f, 17.207f, 18.342f)
                curveTo(16.727f, 17.862f, 16.248f, 17.375f, 15.777f, 16.887f)
                curveTo(15.711f, 16.829f, 15.636f, 16.779f, 15.736f, 16.68f)
                curveTo(16.224f, 16.192f, 16.711f, 15.703f, 17.191f, 15.215f)
                curveTo(17.208f, 15.207f, 17.225f, 15.197f, 17.283f, 15.164f)
                curveTo(17.837f, 15.751f, 18.408f, 16.341f, 18.963f, 16.92f)
                curveTo(19.914f, 15.985f, 20.832f, 15.082f, 21.734f, 14.189f)
                close()
            }
        }
        .build()
        return _fantasyFlightGames!!
    }

private var _fantasyFlightGames: ImageVector? = null
